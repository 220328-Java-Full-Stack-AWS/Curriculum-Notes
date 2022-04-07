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

# Collections Framework

The Collections API is a framework of Java classes and interfaces that implement commonly used data structures

**ALMOST** every class in the collections api implements the Iterable interface

# Itertable Interface and Iterator Interface

## Iterable Interface:
defines a data structure that can be directly traversed using an iterator
- we get this iterator from the .iterator() method

## Iterator Iterface
contains methods for traversing linear data structures, these methods include:
- hasNext()
- next()
- remove()

Any class that implements Iterable can also be used with enhanced for loops

Classes that implement iterable also have the .forEach() each method, which allows users to iterate through a data structure, and perfrom some logic with a lambda expression

# Implementations of Collections API

![collectionshier](CollectionHierarchy.png)

## Lists

The most basic datatype, a collection of ordered data that is preserved

-   Duplicate entries are allowed
-   Elements are accessed by their index, which start at 0

ArrayList: a concrete implementation of the List interface that contains an array within it
- The array is resizable, once it reaches the max capactity is increases its size by 50%
- You can traverse it quickly via index
- Insertion and deletion is slower, because you may have to resize the internal array

LinkedLists: a concrete implementation of the List and Queue interface which is composed of nodes that reference one another
- Insertion and deletion is relatively quick
- Traversal to a spefic index is slower than an ArrayList

## Sets

A collection of data that is not ordered and does not allow duplicate elements

-   does not preserve the order in which elements are inserted

Hashset: is a concrete implementation of the Set interface mapped by a HashMap
- There is no ordering when iterating
- Allows one null value
- Allows fast insertion and traversal

TreeSet: a concrete implementation of the Set interface which maintains a sorted order when the elements are inserted
- It is backed by a Sorted Tree
- Insertion and Deletion is slow
- Cannot contain null elements
- It uses a Comparator to order the elements

## Queues

Collection of data that follows first in first out, unless otherwise specified

ArrayDeque: a concrete implemation of the Queue interface that allows programmers to implement a stack or a queue

- It is a doubled ended queue
- It stores items in a resizable array

Useful ArrayDeque methods:
- pop()
- push()
- peekFirst()
- peekLast()
- pollFirst()
- pollLast()
- offerLast()
- offerFirst()

Priority Queue: a concrete implementation of the Queue interface which orders elements on their natural ordering

- It uses a Comparator to order the elements

## Maps

Data structure that uses key/value pairs to store and retrieve data

The map interface does not implement the Collection Interface, however it is still considered to be part of the Collections API

Since Map is not an interface of the Collection Interface, you cannot directly iterate over a map with an iterator, however there are different aspects of the map that you CAN iterate over

- use the entrySet() method to iterator over the set of Map.entry
- use keySet() method to iterate over the set of keys
- use values() method to returns a Collection of values which you can iterate over

HashMap: a concrete implementation of the Map interface that:
- Stores elements in a key/value
- Insertion and retrieval is fast
- Tradeoff is that it does not maintain insertion order
- Permits one null key, and many null values

TreeMap: a concrete implementation of the Map interface that:
- Store its keys in a sorted tree structure
- Insertion and retrieval is slow
- Cannot contain null keys

HashTable: an older concrete implementation of the Map interface that is threadsafe, and cannot contain null keys or values

# Comparable and Comparator Interfaces

## Comparable:
an interface which defines the natural ordering for a class
- You implement the Comparable interface, and define how the objects of the class should be compared by other objects in Java
- The class must implement the `int compareTo(Object o1)` method, which returns either, 1, 0, -1
    - 0 if the two objects are equal
    - -1 if "this" object is smaller than the object passed into parameter list
    - 1 if "this" object is larger than the object passed into the paramer list

## Comparator
an interface that allows you to define total ordering on some collection of objects

- You create a separate that implements comparator, and implement the compare() method

# collections vs Collection vs Collections
- collections are just a collection of entities
- Collection: is the interface within the Collections API
- Collections: is a utility class that has static, convient methods that operate on data structures in the Collections API