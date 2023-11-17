package com.vitthal.java.collection.treesetdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
                      Iterable(Interface)
                          |extends
                       Collection (Interface)
                          |extends
                         Set (Interface)
                          | extends
                      Sorted Set (interface)
                          | extends
                     Navigable Set (interface)
                          | implements
                       TreeSet (class)

         - TreeSet is implements the set Interface that uses the tree for storage
         - Treeset contains unique elements like HashSet
         - TreeSet access and retrival times are quite fast
         - Treset dosent allow null elements
         - treeset is non synchronized
         - treeset maintains ascending order
         - Treeset can only allow those generic types that are comparable.
            ex: the Comparable interface is being implemented by StringBuffer class

         COnstructors :
          TreeSet() : it is used to construc an empty tree set that will be stored in ascending order
                      according to the natural order of the tree set
          TreeSet(Collection <?E>) it is used to build the new tree set that contains the element of collection c

          TreeSet<Comparator <?super E> : it is used to construct an empty tree set that will be sorted according
                                          to given comparator
          TreeSet(SortedSet <E> s) : it is used to build a tree set that contains element of give SOrted set

          Methods :

          -boolean add(E e) : it is used to add the specific elements to this set
          -addAll(Collection c) : add all the elements in the specified collection
          -E ceiling(E e) : it returns an equal or closest greatest element of the specified element from the set
                           or null there is no such element
          -Comparator <? super E> comparator() : It returns  a comparator that arranges elements in order
          -Iterator descendingIterator(): use to Iterate element is desceding order
          -NaigableSet descendingSet() : it returns the element in reverse order
          -E floor(E e) : it returns the equal or closest least element of the specified element from the set
                         or null there is no such element
          -SortedSet headSet(E toElement): It returns the group of elements that are less than the specified element.
          -NavigableSet headSet(E toElement, boolean inclusive):	It returns the group of elements that are less than
                                                             or equal to(if, inclusive is true) the specified element.
          -E higher(E e) : It returns the closest greatest element of the specified element from the set, or null there is no such element.
          -Iterator iterator() : It is used to iterate the elements in ascending order.
          -E lower(E e)	: It returns the closest least element of the specified element from the set,
                          or null there is no such element.
          -E pollFirst() : It is used to retrieve and remove the lowest(first) element.
          -E pollLast(): It is used to retrieve and remove the highest(last) element.
          -Spliterator spliterator() :It is used to create a late-binding and fail-fast spliterator over the elements.
          -NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
                                 It returns a set of elements that lie between the given range.
          -SortedSet subSet(E fromElement, E toElement)) :
                            It returns a set of elements that lie between the given range which includes
                            fromElement and excludes toElement.
          -SortedSet tailSet(E fromElement):
                            It returns a set of elements that are greater
                             than or equal to the specified element.
          -NavigableSet tailSet(E fromElement, boolean inclusive):
                              It returns a set of elements that are greater than or equal to
                              (if, inclusive is true) the specified element.
          -boolean contains(Object o): It returns true if this set contains the specified element.
          -boolean isEmpty(): It returns true if this set contains no elements.
          -boolean remove(Object o):It is used to remove the specified element from this set if it is present.
          -void clear(): It is used to remove all of the elements from this set.
          -Object clone(): It returns a shallow copy of this TreeSet instance.
          -E first() : It returns the first (lowest) element currently in this sorted set.
          -E last()	: It returns the last (highest) element currently in this sorted set.
          -int size(): It returns the number of elements in this set.


          Treeset takes Object of same type only irrespective of we using generic or raw type
          it does not allow duplications
          it does not allow null
          Not only we should have objects of same type but also the object class that we goona
          use in treeeset that should be comparable
          (it should have implemented comparable interface)



     */
    public static void main(String[] args) {

        /*
        ArrayList of generic type can have all the types
         */
        ArrayList l1 = new ArrayList();
        l1.add(19);
        l1.add("vitthal");

        ArrayList<String> l2 = new ArrayList<>();
        //l2.add(13);
        l2.add("viithal");
        l2.add("amruta");

        // TreeSet

        // we shoud have same type in TreeSet
        /*
        when we add first value in treeset then the all the next values will be going to
        cast to the first value added type

        here first we have added the 10 so the treeset will be going to be a type of Integer
        and if we try to add the other that interger then JVM tries to cast to int
        and if the casting is not proper or invalid then JVM throws the ClassCastExcception
         */

        //when it comes of collection all the primitive types will not be considered
        /*
        for int collection uses Integer wrapper class
        for float collection users Float wrapper class
        for Double collection user Double wrapper class
         */
        TreeSet s1 = new TreeSet(); // generic declaration
        s1.add(10); //
       // s1.add("String"); // we cannot have objects of different type in set

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);
        s1.add(7);
        s1.add(8);
        s1.add(9);
        System.out.println(s1);
        //s1.add(null);// it does not take null value

        /*
        if you have to sort the Object of your type like Student then that class should be comparable
        i.e it should have implemented comparable interface
         */

        /*s1.clear();*/

        // when u want to add your user defined class the it should implements the comparable
        // other wise we can get the run time exception as ClassCast exception
        /*s1.add(new Orange());
        s1.add(new Orange());
        s1.add(new Orange());
        System.out.println(s1);*/

        System.out.println("-- print using descending iterator --");
        Iterator desc = s1.descendingIterator();
        while (desc.hasNext()){
            System.out.println(desc.next());
        }

        System.out.println("Lowest val :"+s1.pollFirst());
        System.out.println("Heighest val :"+s1.pollLast());

        System.out.println("initial set :"+s1);
        System.out.println("reverse set :"+s1.descendingSet());
        System.out.println("Head set :"+s1.headSet(2,true));
        System.out.println("Sub set :"+s1.subSet(4,false, 8, true));
        System.out.println("Tail set :"+s1.tailSet(2, true));

        System.out.println("-----");
        System.out.println("Head set :"+s1.headSet(4));
        System.out.println("Sub set :"+s1.subSet(4, 8));
        System.out.println("Tail set :"+s1.tailSet(8));

    }
}
