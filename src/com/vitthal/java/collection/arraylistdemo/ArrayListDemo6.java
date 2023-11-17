package com.vitthal.java.collection.arraylistdemo;

public class ArrayListDemo6 {
    /*

    Important abstract classes and interfaces in the collection framework

    1. Iterable :
       A class implementing this interface can be used for iterating with Enhanced loop

    2. Collection :
       Base interface in collection heirarchy

    3. List
       -interface for containers that store a sequence of elements
       -we can store the duplicate elements in list

    4. Set, SOrtedSet, NavigableSet, QUeue, Deque
      - Interface for container classes which dont allow the duplicates
      - SOrted Set have elements in sorted order
      - Navigable Set allows searching for set for the closest match
      - Queue is the base interface for container classes that holds elements
        classes implementing QUeue can be LIFO (Last in First Out) as in stack data strucure of FIFO (First In First Out) as in queue data structure
        Deueq we can insert or remove elements from both sides

     5. Map, SortedMap, NavigableMap
        Interfaces for containers that maps keys to value
        SOrted map the keys are sorted order
        Navigable map allows you to search and return the closest match for given criteria
        NOTE : Map heirarchey does not extend collection Interface

     6. Iterable, ListIterator :
         if container class implements Iterator we can traverse the container elements in forwared direction
         If classs implements ListIterator we can traverse in both directions


        Method in Iterator Interface
----------------------------------------------------------------------------
Method : hasNext()
Desccription : checks if the iterator has more elements to traverse
-------------------------------------------

Method : next()
Sescription : moves the iterator to next element and returns that element
------------------------------------------------------

Method : remove()
Description : removes the last visited element from underyling container class
NOTE: next() should have been called before calling remove() else will throw illegalState Exception
-------------------------------------------
-------------------------------------------
         Method in ListIterator Interface

         ListIterator extends Iterator interface
--------------------------------------------------------
Method : boolean hasPrevious()
Descrption : checks if the iterator has more elements to traverse in reverse directon

---------------------------------------------
Method : E previous()
Description : Moves the iterator to next element and returns that element in reverse direction
----------------------------------------------------
Method : nextIndex()
Description : returns the index of the next element in the iteration in forward direction
------------------------------------------------
Method : previousIndex()
Description : Return the index of the next element in the iteration in reverse direction
------------------------------------------------
Method : void set(Element)
Descriptiion : Sets the last element Visited (Using next or previous) it replaces the existing element
------------------------------------------------
Method : void add(Element)
Description : adds the element into the last list the at the current iteration position
--------------------------------------------------------------

******************************** Methods of Collection Interface **********************************
Method : public boolean add(Object element)
Description : is used to insert an element in this collection
---------------------------------------------------------
Method : public boolean addAll(Collection c)
Description : is used to insert the specified collection element in the invoking collection
--------------------------------------------------------
Method : public boolean remove(Object element)
Description : is used to delete an element from this collection
------------------------------------------------------
Method : public boolean removeAll(Collection c)
Description : is used to delete all the elements of specified collection from the invoking collection
-----------------------------------------------------
public : public boolean retainAll(Collection c)
Description : is used to delete all the elements of invoking collection except the specified collection
----------------------------------------------------------
Method : public int size()
Description : returns total no of elements in the collection
--------------------------------------------------------------
public void clear()
removes the total no of elements from the collection
----------------------------------------------------------

public boolean contains(Object element)
is used to search an element
---------------------------------------------
public boolean containsAll(Collection c)
is used to search the specified collection in this collection
--------------------------------------------------------------

Public Iterator iterator()
returns an iterator
------------------------------------------------
public Object[] toArray()
convert collection into array
------------------------------------------------
public boolean isEmpty()
checks if collection is empty
------------------------------------------------
public boolean equals(Object element)
checks is equals two elements
-----------------------------------------------
public int hashCode()
return the hashcode number for collection
-----------------------------------------------
*************************************************************************************************




























     */


}