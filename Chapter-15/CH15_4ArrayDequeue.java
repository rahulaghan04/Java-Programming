package com.Rahulaghan;

import java.util.ArrayDeque;

public class CH15_4ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr1 = new ArrayDeque<>();
        ArrayDeque<Integer> arr2 = new ArrayDeque<>(6);
        arr1.add(11);
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);

        arr2.add(21);
        arr2.add(22);
        arr2.add(23);
        arr2.add(24);
        arr2.add(25);
        arr2.add(26);

        //arr1.addFirst(10); //addFirst(E e)
        //arr1.addLast(15); //addLast(E e)
        //arr1.addAll(arr2);   //addAll(Collection<? extends E> c)
        //arr1.clear();     //clear()
        //arr1.clone();     //clone()
        //System.out.println(arr2.contains(22)); //contains(Object o)
        //System.out.println(arr2.element()); //element()
        //System.out.println(arr2.getFirst());  //getFirst()
        //System.out.println(arr2.getLast());   //getLast()
        //System.out.println(arr1.isEmpty());   //isEmpty()
        //System.out.println(arr2.offer(27));  //offer(E e)
        //System.out.println(arr2.offerFirst(20)); //offerFirst(E e)
        //System.out.println(arr2.offerLast(27));  //offerLast(E e)
        //System.out.println(arr2.peek());           //peek()
        //System.out.println(arr2.peekFirst());   //peekFirst()
        //System.out.println(arr2.peekLast());    //peekLast()
        //System.out.println(arr2.poll());        //poll
        //System.out.println(arr2.pollFirst());   //pollFirst()
        //System.out.println(arr2.pollLast());    //pollLast()
        //System.out.println(arr2.pop());         //pop()
        //arr2.push(20);     //push(E e)
        //System.out.println(arr2.remove());      //remove()
        //System.out.println(arr2.remove(21));     //remove(Object o)
        //System.out.println(arr2.removeFirst()); //removeFirst()
        //System.out.println(arr2.removeLast());  //removeLast()
        //System.out.println(arr2.removeFirstOccurrence(25)); //removeFirstOccurrence(Object o)
        //System.out.println(arr2.removeLastOccurrence(21));  //removeLastOccurrence(Object o)
        //System.out.println(arr2.reversed());    //reversed()
        //System.out.println(arr2.size());        //size()

        for (int element: arr1){
            System.out.print(element);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        for (int element: arr2){
            System.out.print(element);
            System.out.print(", ");
        }
    }
}
