# Object Class

In Java the `Object class` is the root of all classes
- Every class in Java inherits this class

All classes in Java will have these methods defined by the Object class

- Object clone()
- boolean equals(Object o): by default this will perform == on object memory location, you can override this to compare other parts of the object
- void finalize(): this is called by the garbage collector when it determines there are no more references to the object
- Class<?> getClass()
- int hashCode(): return an int indicating the hashcode
    - If you override the equals are are also expected to override the hashCode()
    - The result of hashCode() should not change in a program
    - if .equals() returns true the hashcode should be the same
    - if .equals() returns false, the hashcode can still be the same
- String toString(): this will be called automatically if you try to print out the object with syso, typically you want to override this method otherwise it will print out the fully qualified class name
- The methods below are thread related and will be covered in more depth later on
- void notify()
- void notifyAll()
- void wait()
- void wait(long timeout)
- void wait(long timeout, int nanos)

# Abstract Classes

Abstract classes are more general classes that cannot be instantiated, they act as a template for other classes to be inherited

Abstract classes are created with the `abstract` keyword, and can contain both concrete and abstract methods
- They can also contain variables, and constructors like a normal class
- The reason we can include a constructor, is to enforce the enheriting class to set some properties of the abstract class

# Interfaces

Interfaces are a contract for methods that classes must implement
- Interfaces also cannot be instantiated

Interfaces are implicitly public and abstract
- Every method in an interface is public and abstract
- Interfaces can still have variables, but they will implicitly be public static and final
- In Java 8, default methods were added, which allows programmers to add implemetation to methods in an interface

To inherit from an interface, you must use the `implements` keyword in the class declaration
- You can implement as many interfaces as you wish on a single class
- Interfaces and extend other interfaces