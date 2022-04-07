# Generics

Generics are constructs introduced in Java 5 which enforces compile time type safety by allowing you to use paramaterized types
- They are used heavily in the Collections API

They are essentially a place holder for a future datatype, that helps us enforce type safety

Generics can be declared on a class, method parameter, or return types

With Generics you can restrict a class to only accept objects of a given type and the compiler will prevent you from using any other types

To make a class or interface generic, use angled brackets `<>` when declaring it, and use an arbitrary "generic type" which is determined by invoking the code

Naming conventions for Generics:

- E => Element
- K => Map Key
- V => Map Value
- N => Number
- T => Generic Datatype
- S, U, V and so on => If you need multiple placeholders