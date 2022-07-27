package com.revature;

import java.util.Collection;

public interface CustomList<E> extends Iterable<E> {
    /*
    What are going to promise? This interface represents a promise or contract to implement certain behaviors.
    add(E e) - add item to the end of the list
    get(int index) - get item at index
    remove(int index) - delete item at index
    remove(Object o) - delete first instance of this object
    clear() - delete all items
     */
    void add(E e);
    E get(int index);
    void remove(int index);
    void remove(E e);
    void clear();



}
