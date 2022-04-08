# Annotations

Annotations are special constructs in Java which use @ symbol followed by the name of the annotation
- Annotations are providing meta data to the compiler and JVM

Annotations can be placed over classes, methods, interfaces, and other constructs

Annotations are often used by libraries to abstract functionality or enforce some set of rules
- Annotations are often processed by Reflections API

Some examples of Annotations in Java:
- @Override
- @Deprecated
- @SuppressWarnings
- @FunctionalInterface

# Intro to TDD and Unit Testing

Test Driven Development (TDD) is a process of writing tests for your code, then implementing the code to pass those tests, as you write more advanced tests, your code will become more advanced as well

- This help increase our code coverage of our tests

## Red/Green Testing

Typically associated with TDD, and it is the process of writing a test before the code
- This results in a red

Write code to pass the specific test
- This results in green

Rewrite the test to fail again
- This results in red

Refactor your code to pass again
- This results in green

So on and so forth until your functionality is reached

Our general process for TDD can be broken down into 5 steps

1. Write a unit test
2. Run the test (it will fail)
3. Write code to pass the test
4. Retest, until the test passes
5. Repeat the process

## Unit Tests

Unit testing: is the testing of individual software components in isolation from the rest of the software

Our unit testing can also be known as White Box Testing:
- a testing method in which the internal design of the system being tested is known to the tester

Unit testing can find if/where something goes wrong in your code
- This helps reduce debugging time because you know where to look for an issue in the code
- It also increases code coverage, because you be testing each individual unit/module of code
- It increases confidence in changing and maintaining your code base

It is best practice to include both positive and negative test cases
- Test things that you expect
- Test things that you expect to break/incorrect inputs/etc

# JUnit

Is a Java framework for unit testing
- I'm going to show you JUnit 4
- You can get JUnit 4 with Maven through the Maven repository

It uses annotations to create tests and setup testing environments

- `@Test` - declare a method as a test
- `@BeforeClass` - declare a setup method that runs once before any other test method in class
- `@Before` - declare a setup methods that runs once before every test methods
- `@After` - declare a teardown method that runs after every test method
- `@AfterClass` - declare a teardown method that runs once after the entire test class has finished

JUnit has built in methods to compare your given result and the result of the method during the test
- These are used to verify the state of your application after the test
- These are the assert methods

- `assertTrue()`
- `assertFalse()`
- `assertEquals()`
- `assertNotEquals()`
- `assertThat()`

# Mockito: a Java framework that allows us to mock the functionality of other methods/classes

Again you can get this framework from Maven

Mockito allows for black box testing
- Where you don't know the functionality of a given system, you just need some output
- This is extremely useful for testing methods that rely on output from other methods
- You replace the dependency of the other methods with mocks and stubs

## Mocking Objects with Mockito

Mockito uses annotations to immplement its mocking, to mock an object you put `@Mock` above it

- Mocking an object gives you the ability to prevent the object from doing something, and you can tell it exactly what to do
- This is useful when one peice of code relies on another module, you can have a garenteed return from the dependent module

In you have an object that requires other modules, you can use `@InjectMocks` above the object to give it the dependencies needed

Finally, to be sure the mocking is going to work, you will need to enable the Mockito annotations, to do this you need to create a method that runs before the test suite, and inside of that methods include `MockitoAnnotations.openMocks(this)`