package services;

import entities.ComplicatedThing;
import exceptions.InvalidInputException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.atomic.AtomicReference;

@ExtendWith(MockitoExtension.class)
public class ComplicatedServiceTest {
    //positive test - testing for a success that should be successful
    //negative test - testing for a failure where our input should result in failure
    //exception test - testing that we can cause an exception to be thrown
    //boundary test - multiple tests some positive, some negative. This kind of test is for when there is a valid range of inputs
       // Do 2 negative tests, one on the first value below the range, one on the first value above the range.
       // Then 3 positive tests, one on the least valid value, one on the greatest valid value, and one more on
       // any arbitrary valid value in the range.
       // so, imagine we wanted to test input to a form to make sure we validate the range 5-18 for students enrolling
       // in primary education. Negative tests on 4 and 19, positive tests on 5, 18, and some k within that range, like 10.



    /* we need to prepare our test suite
    and then we need to write some tests:
    We want a positive test on all good inputs
    We want boundary testing on the integer (valid: 1-45000)
    We can intercept the validator logic and force false validation to cause a failure
    */


    private ComplicatedService sut;

    @Mock
    private Validator mockValidator;

    @BeforeAll
    public static void setUpTestSuite() {

    }

    @AfterAll
    public static void tearDownTestSuite() {

    }

    @BeforeEach
    public void setUpTests() {
        sut = new ComplicatedService(mockValidator);
    }

    @AfterEach
    public void tearDownTests() {
        sut = null;
    }

    @Test
    public void test_complicatedWorkSuccessWithAllGoodInputs() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 5;
        Integer squaredInteger = 25;
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        ComplicatedThing returnedThing = sut.complexWork(email, integer, object);

        //assert
        Assertions.assertEquals(expectedThing, returnedThing);
    }

    @Test
    public void test_complicatedWorkFailureBelowIntegerInputBoundary() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 0;
        Integer squaredInteger = 0;//doesn't matter in this test
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        AtomicReference<ComplicatedThing> returnedThing = null;

        //assert
        Assertions.assertThrows(InvalidInputException.class,
                () -> {
                    returnedThing.set(sut.complexWork(email, integer, object));}
                );
    }

    @Test
    public void test_complicatedWorkFailureAboveIntegerInputBoundary() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 45001;
        Integer squaredInteger = 25;//doesn't matter in this test
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        AtomicReference<ComplicatedThing> returnedThing = null;

        //assert
        Assertions.assertThrows(InvalidInputException.class,
                () -> {
                    returnedThing.set(sut.complexWork(email, integer, object));}
        );
    }

    @Test
    public void test_complicatedWorkSuccessAtMinimumIntegerBoundary() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 1;
        Integer squaredInteger = 1;
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        ComplicatedThing returnedThing = sut.complexWork(email, integer, object);

        //assert
        Assertions.assertEquals(expectedThing, returnedThing);
    }

    @Test
    public void test_complicatedWorkSuccessAtMaximumIntegerBoundary() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 45000;
        Integer squaredInteger = 2025000000;
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        ComplicatedThing returnedThing = sut.complexWork(email, integer, object);

        //assert
        Assertions.assertEquals(expectedThing, returnedThing);
    }

    @Test
    public void test_complicatedWorkSuccessAtArbitraryInBoundsInteger() throws InvalidInputException {
        //arrange
        String email = "kyle@email.com";
        String goodSortedEmail = ".@aceeikllmmoy";
        Integer integer = 14035;
        Integer squaredInteger = 196981225;
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(true);

        //act
        ComplicatedThing returnedThing = sut.complexWork(email, integer, object);

        //assert
        Assertions.assertEquals(expectedThing, returnedThing);
    }

    @Test
    public void test_complicatedWorkFailureBadEmailInput() throws InvalidInputException {
        //arrange
        String email = "this is not an email";
        String goodSortedEmail = ".@aceeikllmmoy";//doesn't matter
        Integer integer = 0;
        Integer squaredInteger = 0;//doesn't matter in this test
        Object object = new Object();
        ComplicatedThing expectedThing = new ComplicatedThing(goodSortedEmail, squaredInteger, object);
        Mockito.when(mockValidator.validateEmail(email)).thenReturn(false);//here we intercept the validator and return false, so our inputs above don't actually matter

        //act
        AtomicReference<ComplicatedThing> returnedThing = null;

        //assert
        Assertions.assertThrows(InvalidInputException.class,
                () -> {
                    returnedThing.set(sut.complexWork(email, integer, object));}
        );
    }


}
