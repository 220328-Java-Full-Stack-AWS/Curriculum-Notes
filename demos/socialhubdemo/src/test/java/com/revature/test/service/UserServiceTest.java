package com.revature.test.service;

import com.revature.dao.UserDao;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;
import com.revature.services.UserService;
import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    //BeforeClass will run some method before the entire test class
    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("This runs before any test, but just once");
    }

    //Run before every single test method
    @Before
    public void setupBeforeMethods(){
        System.out.println("This will run before every single method");
        MockitoAnnotations.openMocks(this);
    }

    //After class will run once after all of the methods have ran
    @AfterClass
    public static void tearDownEntireTestSuite(){
        System.out.println("This will print once at the end of all tests");
    }

    //This will run after every individual test method
    @After
    public void tearDownAfterEachTest(){
        System.out.println("This will run after every test method");
    }

    //To write a very simple test, all we need is a void method, and the @Test annotation
    @Test
    public void simpleTest(){
        //We can use the assert methods to test
        boolean boo = false;
        //Some logic, typically, an actual method call
        if(2 > 1){
            boo = true;
        }

        //We test to see if our assumed value is correct
        assertTrue(boo);
    }

    //If we want to ignore a test we can use @Ignore
    @Ignore
    @Test
    public void simpleFail(){
        //We can use the assert methods to test
        boolean boo = false;
        //Some logic, typically, an actual method call
        if(1 > 1){
            boo = true;
        }

        //We test to see if our assumed value is correct
        assertTrue(boo);
    }

    //We can use Mockito to prevent things like making DB calls in our tests
    @Mock
    static UserDao ud;

    //We are also going to use @InjectMocks, because our UserService relies on the UserDao, and we need to inject the mocked
    //dao into the UserService
    @InjectMocks
    static UserService us;

    @Test
    public void registerCreatesANewUser(){
        //We will use doNothing again because the dao method returns nothing
        doNothing().when(ud).saveUser(any());
        User u = us.register("Test", "User", "user@mail.com", "password");

        verify(ud).saveUser(any());
        assertNotNull(u);
    }

    @Test
    public void newUserGetsRandomUsernameTest(){

        //When we call the registerUser from the user service we want to make sure we do not actually call the db
        //For void methods we want to use doNothing()
        //When we call ud.saveUser(with any user object) do nothing, aka, dont make a db call
        doNothing().when(ud).saveUser(any());

        User u = us.register("Test", "User", "user@mail.com", "password");

        verify(ud).saveUser(any());

        //Our username should not be null, becuase user service assigned it
        assertNotNull(u.getUsername());
        //Our username should not be an empty string, because our user service assigned it
        assertFalse(u.getUsername().equals(""));
    }

    @Test
    public void userGetsAllFieldsPopulated(){
        doNothing().when(ud).saveUser(any());
        User u = us.register("Test", "User", "user@mail.com", "password");
        verify(ud).saveUser(any());

        assertEquals("Test", u.getFirst());
        assertEquals("User", u.getLast());
        assertEquals("user@mail.com", u.getEmail());
        assertNotNull(u.getUsername());
        assertEquals("password", u.getPassword());
        assertNotNull(u.getFollowers());
        //The follower list should also be empty
        assertEquals(0, u.getFollowers().size());
        assertNotNull(u.getFollowing());
        assertEquals(0, u.getFollowing().size());
        assertNotNull(u.getPosts());
        assertEquals(0, u.getPosts().size());
    }

    @Test
    public void positiveLoginTest(){

        User u = new User("User", "Test", "UserTest1234", "email@mail.com", "password");

        //When our user dao gets called, instead of doing nothing, we want to return a hardcoded user
        //Any time our test calls the user doa getUserByUsername, we will return the user we created above
        when(ud.getUserByUserName(any())).thenReturn(u);

        User loggedIn = us.login("UserTest1234", "password");

        verify(ud, times(3)).getUserByUserName(any());

        assertTrue(u.equals(loggedIn));

    }

    //We can test for exception by adding expected = exception in the @Test annotation
    @Test(expected = UsernameOrPasswordIncorrectException.class)
    public void wrongUsernameTest(){

        User u = null;
        when(ud.getUserByUserName(any())).thenReturn(u);

        User loggedIn = us.login("UserTest1234", "password");

        //Anything after the us.login does not get run, because the exception was already thrown and the test was complete
        //verify(ud, times(3)).getUserByUserName(any());
    }


    @Test(expected = UsernameOrPasswordIncorrectException.class)
    public void wrongPassword(){
        User u = new User("User", "Test", "UserTest1234", "email@mail.com", "password");
        when(ud.getUserByUserName(any())).thenReturn(u);

        //This again should cause an exception
        us.login("UserTest1234", "pass");

    }


}
