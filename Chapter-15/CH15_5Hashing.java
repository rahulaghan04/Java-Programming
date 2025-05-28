package com.Rahulaghan;

import java.util.HashSet;

public class CH15_5Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>(5);
        HashSet<Integer> set3 = new HashSet<>(5, 0.15f);
        //HashMap<>

        set1.add(51);   //duplicate values are not allowed in hashset.
        set1.add(52);
        set1.add(53);
        set1.add(54);
        set1.add(55);

        //ye 3 methods sirf HashSet<Integer> set1 = new HashSet<>() ispe hi work karte hai.
        //Spliterator<Integer> Set1 = set1.spliterator(); //spliterator()
        //Iterator<Integer> value = set1.iterator();      //iterator()
        //Object[] obj = set1.toArray();                  //toArray()

        set2.add(61);
        set2.add(62);
        set2.add(63);
        set2.add(64); //add(E e)

        set3.add(71);
        set3.add(72);
        set3.add(73);
        //set1.clear();   //clear()
        //System.out.println(set2.contains(63));  //contains(Object o)
        //System.out.println(set3.isEmpty());    //isEmpty()
        //System.out.println(set1.remove(52));   //remove(Object o)
        //System.out.println(set2.size());       //size()
        //set1.forEach((n)-> System.out.println(n));  //spliterator()
        /*while (value.hasNext()){
            System.out.print(value.next()); //iterator()
            System.out.print(", ");
        }
        System.out.println();*/
        /*for (int i=0; i< obj.length; i++){
            System.out.println(obj[i]);     //toArray()
        }*/

        for (int element: set1){
            System.out.print(element);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        for (int element: set2){
            System.out.print(element);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        for (int element: set3){
            System.out.print(element);
            System.out.print(", ");
        }
    }
}
