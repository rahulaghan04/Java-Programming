package com.Rahulaghan;

import java.util.*;
public class CH15_2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(4); //ArrayList(int initialCapacity)
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);

        list1.add(5);
        list1.add(6);   //add(E e)
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(1, 3);  //add(int index, E element)
        list1.add(2, 5);
        //list1.addFirst(4);  //addFirst(E e)
        //list1.addLast(10);  //addLast(E e)
        //System.out.println(list2.contains(16)); //contains(Object o)
        //System.out.println(list1.indexOf(6));   //indexOf(Object o)
        //System.out.println(list1.lastIndexOf(5));   //lastIndexOf(Object o)
        //System.out.println(list1.remove(5)); //remove(int index)
        //System.out.println(list1.remove(2)); //remove(object o)
        //System.out.println(list1.removeFirst());  //removeFirst()
        //System.out.println(list1.removeLast());   //removeLast()
        //System.out.println(list1.set(0,2));  //set(int index, E element)
        //System.out.println(list1.getFirst());  //getFirst();
        //System.out.println(list1.getLast());   //getLast()
        //System.out.println(list2.isEmpty());   //isEmpty()
        //list1.addAll(list2);   //addAll(Collection<? extends E> c)
        //list1.addAll(0, list2);  //addAll(int index, Collection<? extends E> c)
        //list1.removeAll(list2);  //removeAll(Collection<?> c)
        //System.out.println(list1.subList(2,6)); //subList(int fromIndex, int toIndex)
        //list2.clear();   //list.clear()
        //list2.clone();   //list.clone()

        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i));   //get(int index)
            System.out.print(", ");
        }

        System.out.println();
        System.out.println();
        for(int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i));
            System.out.print(", ");
        }
    }
}
