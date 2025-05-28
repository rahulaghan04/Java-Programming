package com.Rahulaghan;

import java.util.LinkedList;
public class CH15_3LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);

        list1.add(5);     //add(E e)
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(0, 4); //add(int index, E element)
        list1.add(0, 3);
        //list1.addFirst(2); //addFirst(E e)
        //list1.addLast(11); //addLast(E e)
        //list1.addAll(list2);   //addAll(Collection<? extends E> c)
        //list1.addAll(0,list2);  //addAll(int index, Collection<? extends E> c)
        //list1.clear();     //clear()
        //list1.clone();     //clone()
        //System.out.println(list1.contains(9)); //contains(Object o)
        //System.out.println(list1.element()); //element()
        //System.out.println(list2.getFirst());  //getFirst()
        //System.out.println(list2.getLast());   //getLast()
        //System.out.println(list1.indexOf(9));  //indexOf(Object o)
        //System.out.println(list1.lastIndexOf(6));  //lastIndexOf(Object o)
        //System.out.println(list2.offer(16));  //offer(E e)
        //System.out.println(list2.offerFirst(10)); //offerFirst(E e)
        //System.out.println(list2.offerLast(17));  //offerLast(E e)
        //System.out.println(list1.peek());    //peek()
        //System.out.println(list1.peekFirst());   //peekFirst()
        //System.out.println(list1.peekLast());    //peekLast()
        //System.out.println(list2.poll());    //poll
        //System.out.println(list2.pollFirst());      //pollFirst()
        //System.out.println(list2.pollLast());       //pollLast()
        //System.out.println(list1.pop());    //pop()
        //list1.push(2);  //push(E e)
        //System.out.println(list1.remove());  //remove()
        //System.out.println(list1.remove(2));  //remove(int index)
        //System.out.println(list2.remove("3"));   //remove(Object o)
        //System.out.println(list1.removeFirst()); //removeFirst()
        //System.out.println(list1.removeLast());  //removeLast()
        //System.out.println(list1.removeFirstOccurrence(3)); //removeFirstOccurrence(Object o)
        //System.out.println(list1.removeLastOccurrence(3)); //removeLastOccurrence(Object o)
        //System.out.println(list1.reversed());    //reversed()
        //System.out.println(list1.set(0,2));      //set(int index, E element)
        //System.out.println(list2.size());        //size()
        //System.out.println(list1.isEmpty());     //isEmpty()

        for (int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i));  //get(int index)
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        for (int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i));
            System.out.print(", ");
        }
    }
}
