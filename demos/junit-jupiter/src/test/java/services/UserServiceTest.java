package services;

import entities.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.UserRepository;



@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    /*
    The Three A's of Testing:
    Arrange - set up the test
    Act  - preform the test
    Assert - check the results
     */

    private UserService sut;

    @Mock
    private UserRepository mockUserRepository;



    //@BeforeAll //apply to method which will be invoked before the suite of tests starts running - was called @BeforeClass in Junit 4
    //@AfterAll //apply to method which will be invoked after all tests have completed - was called @AfterClass in Junit 4

    //@BeforeEach //apply to method which will be invoked before EACH test - was called @Before in Junit 4
    //@AfterEach //apply to method which will be invoked after EACH test - was called @After in Junit 4

    @BeforeAll
    public static void initializeTestSuite() {

    }

    @AfterAll
    public static void tearDownTestSuite() {

    }

    @BeforeEach
    public void initializeTest() {
        sut = new UserService(mockUserRepository);
    }

    @AfterEach
    public void tearDownTest() {
        sut = null;
    }


    @Test
    public void test_authenticateUserSuccess() {
        //arrange
        String username = "username";
        String password = "password";
        String firstName = "firstName";
        String lastName = "lastName";
        User testUser = new User(username, password, firstName, lastName);
        Mockito.when(mockUserRepository.auth(username, password)).thenReturn(testUser);


        //act
        User authenticatedUser = sut.auth(username, password);

        //assert
        //what can we check to prove it worked?
        //in this case we need to make sure that the "authenticatedUser" object returned from our tested method
        //matches the "testUser" object we made.
        Assertions.assertEquals(authenticatedUser, testUser);

    }


    // Still need to check for exceptions being thrown.
    // Still need to check negative outcomes,
    // still need to use "verify"
    // TDD?





}
