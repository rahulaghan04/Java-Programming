package com.Rahulaghan;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.Map.Entry;

public class CH15_SelfExercise {
    public static int isLeapYear(int year){
        if((year%4 == 0 || year%400 == 0) && year%100 != 0){
            return 366;
        }
        else {
            return 365;
        }
    }
    public static void main(String[] args) throws ParseException {
        //1. ArrayList:

        //Q1. Write a Java program to create an array list, add some colors (strings) and print
        // out the collection.
        /*ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Colors: "+colors);*/

        //Q2. Write a Java program to iterate through all elements in an array list.
        /*ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        for(String e: colors){
            System.out.println(e);
        }*/

        //Q3. Write a Java program to insert an element into the array list at the first
            // position.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        list.addFirst(11);
        System.out.println("After inserting an element in first position ArrayList: ");
        System.out.println(list);*/

        //Q4. Write a Java program to retrieve an element (at a specified index) from a given
        // array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(44);
        list.add(55);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        list.add(2,33);
        System.out.println("After retrieve an element (at a specified index) ArrayList: ");
        System.out.println(list);*/

        //Q5. Write a Java program to update an array element by the given element.
        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Dragon fruit");
        System.out.println("Original ArrayList: ");
        System.out.println(fruits);
        fruits.set(4,"Guava");
        System.out.println("After update an element (at a specified index) ArrayList:");
        System.out.println(fruits);*/

        //Q6. Write a Java program to remove the third element from an array list.
        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Dragon fruit");
        System.out.println("Original ArrayList: ");
        System.out.println(fruits);
        fruits.remove(4);
        System.out.println("After removing an element (at a specified index) ArrayList:");
        System.out.println(fruits);*/

        //Q7.  Write a Java program to search for an element in an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        System.out.println(list.contains(44));
        System.out.println(list.contains(59));*/

        //Q8. Write a Java program to sort a given array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(56);
        list.add(12);
        list.add(5);
        list.add(86);
        list.add(19);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        System.out.println("Sorted ArrayList: ");
        Collections.sort(list);
        System.out.println(list);*/

        //Q9. Write a Java program to copy one array list into another.
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);
        list2.add(44);
        list2.add(55);
        System.out.println("Original ArrayList: ");
        System.out.println(list1);
        System.out.println(list2);
        Collections.copy(list1,list2);
        System.out.println("After copy list1 to list2: ");
        System.out.println(list1);
        System.out.println(list2);*/

        //Q10. Write a Java program to shuffle elements in an array list.
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("Original ArrayList: ");
        System.out.println(list1);
        System.out.println("After Shuffling ArrayList: ");
        Collections.shuffle(list1);
        System.out.println(list1);*/

        //Q11. Write a Java program to reverse elements in an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        System.out.println("After reversing ArrayList: ");
        Collections.reverse(list);
        System.out.println(list);*/

        //Q12. Write a Java program to extract a portion of an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        System.out.println("After extract a portion of an ArrayList: ");
        List<Integer> list2 = list.subList(0,3);
        System.out.println(list2);*/

        //Q13. Write a Java program to compare two array lists.
        /*ArrayList<String> students1 = new ArrayList<>();
        students1.add("Rahul");
        students1.add("Ravi");
        students1.add("Amar");
        students1.add("Kumar");
        students1.add("Akash");
        ArrayList<String> students2 = new ArrayList<>();
        students2.add("Rahul");
        students2.add("Ravi");
        students2.add("Amar");
        students2.add("Kiran");
        students2.add("Akash");
        System.out.println("ArrayList1: "+students1);
        System.out.println("ArrayList2: "+students2);
        ArrayList<String> students3 = new ArrayList<>();
        for (String e: students1){
            students3.add(students2.contains(e) ? "Yes" : "No");
        }
        System.out.println(students3);*/

        //Q14. Write a Java program that swaps two elements in an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(42);
        list.add(52);
        System.out.println("Original ArrayList: ");
        System.out.println(list);
        System.out.println("After Swapping an element ArrayList: ");
        Collections.swap(list,0,3);
        System.out.println(list);*/

        //Q15. Write a Java program to join two array lists.
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(22);
        list1.add(33);
        list1.add(44);
        System.out.println("List 1: "+list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(55);
        list2.add(66);
        list2.add(77);
        System.out.println("List 2: "+list2);
        list1.addAll(4,list2);
        System.out.println("List1 + List2: "+list1);*/

        //Q16. Write a Java program to clone an array list to another array list.
        /*ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(22);
        list1.add(33);
        list1.add(44);
        System.out.println("Original ArrayList: "+list1);
        ArrayList<Integer> newList1 = (ArrayList<Integer>)list1.clone();
        System.out.println("Cloned ArrayList: "+newList1);*/

        //Q17. Write a Java program to empty an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original ArrayList: "+list);
        list.removeAll(list);
        System.out.println("After empty an ArrayList: "+list);*/

        //Q18. Write a Java program to test whether an array list is empty or not.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original ArrayList: "+list);
        list.removeAll(list);
        System.out.println("After empty an ArrayList: "+list);
        System.out.println("ArrayList empty?: "+list.isEmpty());*/

        //Q19. Write a Java program for trimming the capacity of an array list.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original ArrayList: "+list);
        list.trimToSize();
        System.out.println("After Trimmed to size ArrayList: "+list);*/

        //Q20.Write a Java program to increase an array list size.
        /*ArrayList<String> name = new ArrayList<>(3);
        name.add("Arjun");
        name.add("Roshan");
        name.add("Ketan");
        System.out.println("Original ArrayList: "+name);
        name.ensureCapacity(3);
        name.add("Anmol");
        name.add("Rutik");
        name.add("Raj");
        System.out.println("After increasing Capacity of ArrayList: "+name);*/

        //Q21. Write a Java program to replace the second element of an ArrayList with the
            // specified element.
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(33);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("Original ArrayList: "+list);
        int new_element = 22;
        list.set(1,new_element);
        System.out.printf("After replace second element of an ArrayList with the %d ,ArrayList: ",new_element);
        System.out.println(list);*/

        //Q22. Write a Java program to print all the elements of an ArrayList using the
            // elements' position.
        /*ArrayList<String> name = new ArrayList<>();
        name.add("Akash");
        name.add("Rahul");
        name.add("Pratik");
        name.add("Baban");
        System.out.println("Original ArrayList: "+name);
        System.out.println("Print using index of an element: ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }*/

        //2. Linked List:

        //Q23.  Write a Java program to append the specified element to the end of a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(100);
        System.out.println("Original LinkedList: "+list);
        list.addLast(120);
        System.out.println("After append the specified element to the end of a linked list: "+list);*/

        //Q24. Write a Java program to iterate through all elements in a linked list.
        /*LinkedList<String> name = new LinkedList<>();
        name.add("Akash");
        name.add("Rahul");
        name.add("Pratik");
        name.add("Baban");
        System.out.println("Original LinkedList: "+name);
        System.out.println("Print iterate through all elements in a linked list: ");
        for (String e: name){
            System.out.println(e);
        }*/

        //Q25. Write a Java program to iterate through all elements in a linked list starting
            // at the specified position.
        /*LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        System.out.println("Original LinkedList: "+numberList);
        System.out.println("Print all elements in a linked list on iterate, starting at 4 position: ");
        Iterator<Integer> position = numberList.listIterator(4);
        while (position.hasNext()){
            System.out.println(position.next());
        }*/

        //Q26. Write a Java program to iterate a linked list in reverse order.
        /*LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        System.out.println("Original LinkedList: "+numberList);
        System.out.println("Print iterate a linked list in reverse order: ");
        Iterator<Integer> rev = numberList.descendingIterator();
        while (rev.hasNext()){
            System.out.println(rev.next());
        }*/

        //Q27. Write a Java program to insert the specified element at the specified position
            // in the linked list.
        /*LinkedList<String> name = new LinkedList<>();
        name.add("Guru");
        name.add("Baban");
        name.add("Kunal");
        name.add("Manan");
        System.out.println("Original LinkedList: "+name);
        name.add(2,"Jagan");
        System.out.println("After inserting the specified element at the specified position in the linked list: "+name);*/

        //Q28. Write a Java program to insert elements into the linked list at the first and last
            // positions.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Original LinkedList: "+list);
        list.addFirst(10);
        list.addLast(70);
        System.out.println("After inserting elements into the linked list at the first and last positions: ");
        System.out.println(list);*/

        //Q29. Write a Java program to insert the specified element at the front of a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Original LinkedList: "+list);
        list.offerFirst(10);
        System.out.println("After inserting the specified element at the front of a linked list: ");
        System.out.println(list);*/

        //Q30. Write a Java program to insert the specified element at the end of a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Original LinkedList: "+list);
        list.offerLast(70);
        System.out.println("After inserting the specified element at the end of a linked list: ");
        System.out.println(list);*/

        //Q31. Write a Java program to insert some elements at the specified position into a
            // linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(100);
        System.out.println("Original LinkedList: "+list);
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(60);
        newList.add(80);
        list.addAll(2,newList);
        System.out.println("After inserting some elements at the specified position into a linked list: ");
        System.out.println(list);*/

        //Q32. Write a Java program to get the first and last occurrence of the specified
            // elements in a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println("Original LinkedList: "+list);
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element: "+list.getLast());*/

        //Q33. Write a Java program to display elements and their positions in a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(11);
        list.add(45);
        list.add(21);
        list.add(2);
        list.add(47);
        System.out.println("Original LinkedList: "+list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index "+i+" is: "+list.get(i));
        }*/

        //Q34. Write a Java program to remove a specified element from a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(11);
        list.add(45);
        list.add(21);
        list.add(2);
        list.add(47);
        System.out.println("Original LinkedList: "+list);
        Object element = list.remove(3);
        System.out.println("Removed element: "+element);
        System.out.println("New LinkedList: ");
        System.out.println(list);*/

        //Q35. Write a Java program to remove the first and last elements from a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(11);
        list.add(45);
        list.add(21);
        list.add(2);
        list.add(47);
        System.out.println("Original LinkedList: "+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing the first and last elements from a linked list: ");
        System.out.println(list);*/

        //Q36. Write a Java program to remove all elements from a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(11);
        list.add(45);
        list.add(21);
        list.add(2);
        list.add(47);
        System.out.println("Original LinkedList: "+list);
        list.removeAll(list);
        System.out.println("After removing all elements from a linked list: ");
        System.out.println(list);*/

        //Q37. Write a Java program that swaps two elements in a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("Original LinkedList: "+list);
        Collections.swap(list,0,5);
        System.out.println("After Swapping: ");
        System.out.println(list);*/

        //Q38. Write a Java program to shuffle elements in a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("Original LinkedList: "+list);
        Collections.shuffle(list);
        System.out.println("After Shuffling: ");
        System.out.println(list);*/

        //Q39. Write a Java program to join two linked lists.
        /*LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        System.out.println("List 1: "+list1);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(14);
        list2.add(15);
        list2.add(16);
        System.out.println("List 2: "+list2);
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("After adding list1 and list2: "+list3);*/

        //Q40. Write a Java program to copy a linked list to another linked list.
        /*LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        System.out.println("Original LinkedList: "+list1);
        LinkedList<Integer> newList = (LinkedList<Integer>)list1.clone();
        System.out.println("Copy of list: "+newList);*/

        //Q41. Write a Java program to remove and return the first element of a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("Original LinkedList: "+list);
        System.out.println("After removing and return the first element of a linked list: ");
        System.out.println(list.pollFirst());
        System.out.println(list);*/

        //Q42. Write a Java program to retrieve, but not remove, the first element of a linked
            // list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("Original LinkedList: "+list);
        System.out.println("After retrieve, but not remove, the first element of a linked list: ");
        System.out.println(list.peekFirst());
        System.out.println(list);*/

        //Q43. Write a Java program to retrieve, but not remove, the last element of a linked
            // list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("Original LinkedList: "+list);
        System.out.println("After retrieve, but not remove, the last element of a linked list: ");
        System.out.println(list.peekLast());
        System.out.println(list);*/

        //Q44. Write a Java program to check if a particular element exists in a linked list.
        /*Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(3);
        list.add(14);
        list.add(90);
        list.add(56);
        System.out.println("Original LinkedList: "+list);
        System.out.print("Enter the element: ");
        int num = sc.nextInt();
        System.out.println("element exists or not in a linked list: "+list.contains(num));*/

        //Q45. Write a Java program to convert a linked list to an array list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(3);
        list.add(14);
        list.add(90);
        list.add(56);
        System.out.println("Original LinkedList: "+list);
        List<Integer> newList = new ArrayList<Integer>(list);
        System.out.println("ArrayList: "+newList);*/

        //Q46. Write a Java program to compare two linked lists.
        /*LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(50);
        list2.add(40);
        list2.add(50);
        System.out.println("LinkedList 1: "+list1);
        System.out.println("LinkedList 2: "+list2);
        LinkedList<Integer> compare = new LinkedList<>();
        for (int e: list1){
            compare.add(list2.contains(e) ? 1 : 0);
        }
        System.out.println(compare);*/

        //Q47. Write a Java program to check if a linked list is empty or not.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original LinkedList: "+list);
        list.removeAll(list);
        System.out.println("After removing all element: "+list);
        System.out.println("LinkedList is Empty or not: "+list.isEmpty());*/

        //Q48. Write a Java program to replace an element in a linked list.
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original LinkedList: "+list);
        Object replaceEl = list.set(3,15);
        System.out.println("Replaced element: "+replaceEl);
        System.out.println("After replacing an element in a linked list: ");
        System.out.println(list);*/

        //3. HashSet

        //Q49. Write a Java program to append the specified element to the end of a hash set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        colors.add("Black");
        System.out.println("After append the specified element to the end of a hash set: ");
        System.out.println(colors);*/

        //Q50. Write a Java program to iterate through all elements in a hash list.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: ");
        for (String c: colors){
            System.out.println(c);
        }*/

        //Q51. Write a Java program to get the number of elements in a hash set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        System.out.println("No. of elements in HashSet: "+colors.size());*/

        //Q52.  Write a Java program to empty an hash set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        colors.removeAll(colors);
        System.out.println("After removing all elements: "+colors);*/

        //Q53. Write a Java program to test if a hash set is empty or not.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        colors.removeAll(colors);
        System.out.println("After removing all elements: "+colors);
        System.out.println("HashSet is empty or not: "+colors.isEmpty());*/

        //Q54. Write a Java program to clone a hash set to another hash set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        HashSet<String> colorsClone = new HashSet<>(colors);
        System.out.println("Clone of colors: "+colorsClone);*/

        //Q55. Write a Java program to convert a hash set to an array.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        String[] array = new String[colors.size()];
        colors.toArray(array);
        System.out.println("Array element: ");
        for (String c: array){
            System.out.println(c);
        }*/

        //Q56. Write a Java program to convert a hash set to a tree set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        Set<String> newColors = new TreeSet<>(colors);
        System.out.println("New TreeSet: "+newColors);*/

        //Q57. Write a Java program to compare two hash set.
        /*HashSet<String> colors1 = new HashSet<>();
        colors1.add("Pink");
        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Purple");
        System.out.println("Set 1: "+colors1);
        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Pink");
        colors2.add("Red");
        colors2.add("White");
        colors2.add("Purple");
        System.out.println("Set 2: "+colors2);
        for (String e: colors1){
            System.out.print(colors2.contains(e) ? "Yes " : "No ");
        }*/

        //Q58. Write a Java program to compare two sets and retain elements that are the same.
        /*HashSet<String> colors1 = new HashSet<>();
        colors1.add("Pink");
        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Purple");
        System.out.println("Set 1: "+colors1);
        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Pink");
        colors2.add("Red");
        colors2.add("White");
        colors2.add("Purple");
        System.out.println("Set 2: "+colors2);
        for (String e: colors1){
            System.out.print(colors2.contains(e) ? "Yes " : "No ");
        }
        colors1.retainAll(colors2);
        System.out.println("\nSame Element: "+colors1);*/

        //Q59. Write a Java program to remove all elements from a hash set.
        /*HashSet<String> colors = new HashSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        System.out.println("Original HashSet: "+colors);
        colors.removeAll(colors);
        System.out.println("After removing all element of HashSet: "+colors);*/

        //4. Tree Set

        //Q60. Write a Java program to create a tree set, add some colors (strings) and print out
            // the tree set.
        /*TreeSet<String> colors = new TreeSet<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("White");
        System.out.println("TreeSet: "+colors);*/

        //Q61. Write a Java program to find numbers less than 7 in a tree set.
        /*TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet treeHeadset = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(31);
        treeSet.add(4);
        treeSet.add(61);
        treeSet.add(8);
        treeSet.add(9);
        System.out.println("TreeSet: "+treeSet);
        treeHeadset = (TreeSet) treeSet.headSet(7);
        Iterator iterator = treeHeadset.iterator();
        System.out.println("Less than 7 Tree set element: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }*/
        
        //Q62. Write a Java program to iterate through all elements in a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(13);
        set.add(7);
        set.add(89);
        System.out.println("TreeSet: ");
        for (int e: set){
            System.out.println(e);
        }*/

        //Q63. Write a Java program to add all the elements of a specified tree set to another
            // tree set.
        /*TreeSet<String> colors = new TreeSet<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Grey");
        colors.add("Blue");
        System.out.println("Tree Set1: "+colors);
        TreeSet<String> newColors = new TreeSet<>();
        newColors.add("Pink");
        newColors.add("Orange");
        newColors.add("Red");
        System.out.println("Tree Set2: "+newColors);
        newColors.addAll(colors);
        System.out.println("After adding all the elements of a first tree set to another tree set: "+newColors);*/

        //Q64. Write a Java program to create a reverse order view of the elements contained in a
            // given tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Original Tree Set: "+set);
        Iterator iterator = set.descendingIterator();
        System.out.println("Reverse order Tree Set: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //Q65. Write a Java program to get the first and last elements in a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Original Tree Set: "+set);
        System.out.println("First Element: "+set.getFirst());
        System.out.println("Last Element: "+set.getLast());*/

        //Q66. Write a Java program to clone a tree set list to another tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Clone Tree Set: "+set.clone());*/

        //Q67. Write a Java program to get the number of elements in a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Number of Elements in Tree Set: "+set.size());*/

        //Q68. Write a Java program to compare two tree sets.
        /*TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        set1.add(5);
        set1.add(6);
        System.out.println("Tree Set1 : "+set1);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(9);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Tree Set2 : "+set2);
        for (int e: set1){
            System.out.print(set2.contains(e) ? 0+" " : 1+" ");
        }*/

        //Q69. Write a Java program to get the element in a tree set which is greater than
            // or equal to the given element.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Greater than or equal to 20: "+set.ceiling(20));*/

        //Q70. Write a Java program to get the element in a tree set less than or equal to the
            // given element.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Less than to 30: "+set.floor(30));*/

        //Q71. Write a Java program to get the element in a tree set strictly greater than or equal
            // to the given element.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Strictly greater than to 40: "+set.higher(40));*/

        //Q72. Write a Java program to get an element in a tree set that has a lower value
            // than the given element.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        System.out.println("Lower value to 40: "+set.lower(40));*/

        //Q73. Write a Java program to retrieve and remove the first element of a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        set.pollFirst();
        System.out.println("After retrieve and remove the first element of a tree set: ");
        System.out.println(set);*/

        //Q74. Write a Java program to retrieve and remove the last element of a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        set.pollLast();
        System.out.println("After retrieve and remove the last element of a tree set: ");
        System.out.println(set);*/

        //Q75. Write a Java program to remove a given element from a tree set.
        /*TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(32);
        set.add(44);
        set.add(55);
        set.add(66);
        System.out.println("Original Tree Set: "+set);
        int element = 32;
        set.remove(element);
        System.out.println("After removing given element: "+element);
        System.out.println(set);*/

        //5. Priority Queue

        //Q76. Write a Java program to create a priority queue, add some colors (strings) and
            // print out the elements of the priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Red");
        System.out.println("Queue: "+colors);*/

        //Q77. Write a Java program to iterate through all elements in the priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Red");
        System.out.println("Queue: ");
        for (String c: colors){
            System.out.println(c);
        }*/

        //Q78. Write a Java program to add all the elements of a priority queue to another
            // priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue 1: "+colors);
        PriorityQueue<String> newColors = new PriorityQueue<>();
        newColors.add("Pink");
        newColors.add("Red");
        newColors.add("Blue");
        newColors.add("Green");
        System.out.println("Queue 2: "+newColors);
        colors.addAll(newColors);
        System.out.println("After adding Queue2 in Queue1: "+colors);*/

        //Q79. Write a Java program to insert a given element into a priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        colors.offer("Blue");
        System.out.println("After adding new Element: "+colors);*/

        //Q80. Write a Java program to remove all elements from a priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        colors.clear();
        System.out.println("After removing all the Element in queue: "+colors);*/

        //Q81. Write a Java program to count the number of elements in a priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        System.out.println("Number of Elements in queue: "+colors.size());*/

        //Q82. Write a Java program to compare two priority queues.
        /*PriorityQueue<String> colors1 = new PriorityQueue<>();
        colors1.add("Black");
        colors1.add("Purple");
        colors1.add("White");
        colors1.add("Yellow");
        System.out.println("Queue 1: "+colors1);
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.add("Black");
        colors2.add("Blue");
        colors2.add("Pink");
        colors2.add("Yellow");
        System.out.println("Queue 2: "+colors2);
        for (String c: colors1){
            System.out.print(colors2.contains(c) ? "Yes " : "No ");
        }*/

        //Q83. Write a Java program to retrieve the first element of the priority queue.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        System.out.println("After retrieve the first element of the priority queue: "+colors.peek());*/

        //Q84. Write a Java program to retrieve and remove the first element.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        System.out.println("remove first element of the priority queue: "+colors.poll());
        System.out.println("Priority Queue after removing first element: "+colors);*/

        //Q85. Write a Java program to convert a priority queue to an array containing all
            // its elements.
        /*PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("Purple");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Queue: "+colors);
        List<String> colorsArray = new ArrayList<>(colors);
        System.out.println("priority queue to an array containing all its element: "+colorsArray);*/

        //Q86. Write a Java program to change priorityQueue to maximum priority queue.
        /*PriorityQueue<Integer> queue = new PriorityQueue<>(10,Collections.reverseOrder());
        queue.add(23);
        queue.add(56);
        queue.add(79);
        queue.add(13);
        queue.add(67);
        queue.add(90);
        queue.add(43);
        queue.add(21);
        queue.add(7);
        queue.add(40);
        System.out.println("Original Priority Queue: "+queue);
        System.out.println("Maximum Priority Queue: ");
        Integer val;
        while ((val = queue.poll()) != null){
            System.out.print(val+" ");
        }
        System.out.println();*/

        //6. HashMap

        //Q87. Write a Java program to associate the specified value with the specified key in
            // a HashMap.
        /*HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Black");
        hashMap.put(2,"White");
        hashMap.put(3,"Blue");
        hashMap.put(4,"Red");
        hashMap.put(5,"Yellow");
        hashMap.put(6,"Pink");
        for (Map.Entry c: hashMap.entrySet()){
            System.out.println(c.getKey()+" "+c.getValue());
        }*/

        //Q88. Write a Java program to count the number of key-value (size) mappings in a map.
        /*HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Black");
        hashMap.put(2,"White");
        hashMap.put(3,"Blue");
        hashMap.put(4,"Red");
        hashMap.put(5,"Yellow");
        hashMap.put(6,"Pink");
        System.out.println("Hash Map: "+hashMap);
        System.out.println(hashMap.size());*/

        //Q89. Write a Java program to copy all mappings from the specified map to another map.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap 1: "+colors);
        HashMap<Integer,String> newColors = new HashMap<>();
        newColors.put(5,"Yellow");
        newColors.put(6,"Pink");
        newColors.put(7,"Purple");
        newColors.put(8,"Green");
        System.out.println("HashMap 2: "+newColors);
        colors.putAll(newColors);
        System.out.println("After adding Hashmap2 into Hashmap1: ");
        for (Entry c: colors.entrySet()){
            System.out.println(c.getKey()+" "+c.getValue());
        }*/

        //Q90. Write a Java program to remove all mappings from a map.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap 1: "+colors);
        colors.clear();
        System.out.println("After removing all mappings from a map: "+colors);*/

        //Q91. Write a Java program to check whether a map contains key-value mappings (empty) or
            // not.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap 1: "+colors);
        colors.clear();
        System.out.println("After removing all mappings from a map: "+colors);
        System.out.println("Hash Map is Empty or not: "+colors.isEmpty());*/

        //Q92. Write a Java program to get a shallow copy of a HashMap instance.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap: "+colors);
        System.out.println("Shallow Copy of HashMap: "+colors.clone());*/

        //Q93. Write a Java program to test if a map contains a mapping for the specified key.
        /*Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap: "+colors);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        if(colors.containsKey(key)){
            System.out.println("Yes, map contain this key.");
        } else {
            System.out.println("No, map not contain this key.");
        }*/

        //Q94. Write a Java program to test if a map contains a mapping for the specified value.
        /*Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap: "+colors);
        System.out.println("Enter the value(Color name): ");
        String value = sc.next();
        if(colors.containsValue(value)){
            System.out.println("Yes, map contain this value.");
        } else {
            System.out.println("No, map not contain this value.");
        }*/

        //Q95. Write a Java program to create a set view of the mappings contained in a map.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap values: "+colors);
        Set set = colors.entrySet();
        System.out.println("Set values: "+set);*/

        //Q96. Write a Java program to get the value of a specified key in a map.
        /*Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("HashMap values: "+colors);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        String value = colors.get(key);
        System.out.printf("Value of key %d is: ",key);
        System.out.println(value);*/

        //Q97. Write a Java program to get a collection view of the values contained in this
            // map.
        /*HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Black");
        colors.put(2,"White");
        colors.put(3,"Blue");
        colors.put(4,"Red");
        System.out.println("Collection view is: "+colors.values());*/

        //7. Date, Time and calendar class

        //Q98. Write a Java program to create a Date object using the Calendar class.
        /*int year = 2020;
        int month = 4;
        int date = 25;
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DATE,date);
        System.out.println(cal.getTime());*/

        //Q99.  Write a Java program to get and display information (year, month, day, hour, minute)
            // about a default calendar.
        /*Calendar calendar = Calendar.getInstance();
        System.out.println("Year: "+calendar.get(Calendar.YEAR));
        System.out.println("Month: "+calendar.get(Calendar.MONTH));
        System.out.println("Day: "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour: "+calendar.get(Calendar.HOUR));
        System.out.println("Minute: "+calendar.get(Calendar.MINUTE));*/

        //Q100. Write a Java program to get the maximum value of the year, month, week, and
            // date from the current date of a default calendar.
        /*Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time: "+calendar.getTime());
        System.out.println("Actual max Year: "+calendar.getActualMaximum(Calendar.YEAR));
        System.out.println("Actual max Month: "+calendar.getActualMaximum(Calendar.MONTH));
        System.out.println("Actual max Week: "+calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual max Date: "+calendar.getActualMaximum(Calendar.DATE));*/

        //Q101. Write a Java program to get the minimum value of year, month, week, date from
            // the current date of a default calendar.
        /*Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time: "+cal.getTime());
        System.out.println("Actual min Year: "+cal.getActualMinimum(Calendar.YEAR));
        System.out.println("Actual min Month: "+cal.getActualMinimum(Calendar.MONTH));
        System.out.println("Actual min Week: "+cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual min Date: "+cal.getActualMinimum(Calendar.DATE));*/

        //Q102. Write a Java program to get the current time in New York.
        /*Calendar newYorkTime = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in NewYork: "+newYorkTime.get(Calendar.HOUR_OF_DAY)+":"+newYorkTime.get(Calendar.MINUTE)+":"+newYorkTime.get(Calendar.SECOND));*/

        //Q103. Write a Java program to get the current date and time.
        /*Calendar cal = Calendar.getInstance();
        System.out.println("Current Date & Time: "+cal.getTime());*/

        //Q104. Write a Java program to get the last day of the current month.
        /*Calendar cal = Calendar.getInstance();
        System.out.println("Last Day of the Current Month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));*/

        //Q105. Write a Java program to get the last date of the month.
        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Last Date of the Month: "+cal.getTime());*/

        //Q106. Write a Java program to calculate the first and last day of each week.
        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("First Day of Week : "+df.format(cal.getTime()));
        for (int i = 0; i < 6; i++) {
            cal.add(Calendar.DATE,1);
        }
        System.out.println("Last Day of Week: "+df.format(cal.getTime()));*/

        //Q107. Write a Java program to get the first and last day of a month.
        /*YearMonth ym = YearMonth.of(2024,2);
        System.out.print("First Day of the Month: ");
        System.out.println(ym.atDay(1).getDayOfWeek().name());
        System.out.print("Last Day of the Month: ");
        System.out.println(ym.atEndOfMonth().getDayOfWeek().name());*/

        //Q108. Write a Java program to get the number of days in a month.
        /*Calendar cal = Calendar.getInstance();
        System.out.println("No. of days in this month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));*/

        //Q109. Write a Java program to get localized day-of-week names.
        /*DateFormatSymbols dfs = new DateFormatSymbols(new Locale("Hindi"));
        String[] dayNames = dfs.getWeekdays();
        for (String e: dayNames){
            System.out.println(e);
        }*/

        //Q110. Write a Java program to get a day of the week on a specific date.
        /*Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week: "+dayOfWeek);*/

        //Q111. Write a Java program to get the current local time.
        /*LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Date: "+ldt.toLocalDate());
        System.out.println("Current Time: "+ldt.toLocalTime());*/

        //Q112. Write a Java program to add hours to the current time.
        /*LocalTime ldt = LocalTime.now();
        LocalTime newTime = ldt.plusHours(2);
        System.out.println("Time after 2 hours: "+newTime);*/

        //Q113. Write a Java program to get a date after 2 weeks.
        /*LocalDate date = LocalDate.now();
        LocalDate newDate = date.plusWeeks(2);
        System.out.println("Date after 2 weeks: "+newDate);*/

        //Q114. Write a Java program to get a date before and after 1 year and compare it to the
            // current date.
        /*Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        cal.add(Calendar.YEAR,1);
        Date nextYear = cal.getTime();
        cal.add(Calendar.YEAR,-2);
        Date previousYear = cal.getTime();
        System.out.println("Current Date: "+date);
        System.out.println("Date after 1 year : "+nextYear);
        System.out.println("Date before 1 year : "+previousYear);*/

        //Q115. Write a Java program to check if a year is a leap year or not.
        /*int year = 2020;
        if((year%4 == 0 ) || ((year%400 == 0 && year%100 != 0))){
            System.out.println("Year "+year+" is leap Year.");
        }
        else {
            System.out.println("Year "+year+" is not leap Year.");
        }*/

        //Q116. Write a Java program to get the year and month between two dates.
        /*LocalDate ld = LocalDate.now();
        LocalDate userDay = LocalDate.of(2026,Month.MAY,20);
        Period diff = Period.between(ld,userDay);
        System.out.println("Difference between "+userDay+" and "+ld+": "+diff.getYears()+" Years of "+diff.getMonths()+" Months.");*/

        //Q117. Write a Java program to get the current timestamp.
        /*Instant timestamp = Instant.now();
        System.out.println("Current Timestamp: "+timestamp);*/

        //Q118. Write a Java program to get the current time in all time zones.
        /*ZoneId.SHORT_IDS.keySet().forEach(
                zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );*/

        //Q119. Write a Java program to get the dates 10 days before and after today.
        /*LocalDate date = LocalDate.now();
        System.out.println("Current Date: "+date);
        System.out.println("Date before 10 days today: "+date.plusDays(-10));
        System.out.println("Date After 10 days today: "+date.plusDays(10));*/

        //Q120. Write a Java program to get the number of months left in the year.
        /*LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDayOfYear);
        System.out.println("Month remaining in the Year: "+period.getMonths());*/

        //Q121. Write a Java program to display dates in the following formats.
        /*LocalDate ld = LocalDate.now();
        System.out.println("Default format of Local Date: "+ld);
        System.out.println(ld.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Default format of Local Date And Time: "+dt);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("d::MMM::uuuu hh::mm::ss")));
        Instant timestamp = Instant.now();
        System.out.println("Default format of instant: "+timestamp);
        LocalDateTime ldt = LocalDateTime.parse("04::Feb::2024 17::03::55",DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format After parsing: "+ldt);*/

        //Q122. Write a Java program to get the information of the current/given year.
        /*Year year = Year.now();
        System.out.println("Current Year: "+year);
        boolean leap = year.isLeap();
        System.out.println("is Current year Leap year?: "+leap);
        int length = year.length();
        System.out.println("Length of the Year: "+length+" Days");*/

        //Q123. Write a Java program to get the information of the current/given month.
        /*LocalDate ldt = LocalDate.of(2024,Month.FEBRUARY,4);
        Month month = ldt.getMonth();
        int mnIntValue = month.getValue();
        int mxIntegerMonth = month.maxLength();
        int mnIntegerMonth = month.minLength();
        Month firstMonthOfQuarter = month.firstMonthOfQuarter();
        System.out.println("Integer value of current month: "+mnIntValue);
        System.out.println("Length of the Month: "+mnIntegerMonth);
        System.out.println("Maximum length of the month: "+mxIntegerMonth);
        System.out.println("First month of the Quarter: "+firstMonthOfQuarter);*/

        //Q124. Write a Java program to get information about a given time.
        /*LocalTime time = LocalTime.of(5,26,30);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("Current Local Time: "+time);
        System.out.println("Hour: "+hour);
        System.out.println("Minute: "+minute);
        System.out.println("Seconds: "+second);*/

        //Q125. Write a Java program that displays the date time information before a certain
            // number of hours and minutes from the current date.
        /*LocalDateTime ldt = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println("Current Local Date Time: "+LocalDateTime.now());
        System.out.println("before 5 hours and 30 minutes: "+ldt);*/

        //Q126. Write a Java program to convert a string to a date.
        /*String string = "June 2, 2024";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string,dtf);
        System.out.println(date);*/

        //Q127. Write a Java program to compute the difference between two dates (years, months,
            // days).
        /*LocalDate date = LocalDate.of(2015,3,14);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(date,now);
        System.out.println("Difference is "+diff.getYears()+" Years, "+diff.getMonths()+" Months and "+diff.getDays()+" Days old.");*/

        //Q128. Write a Java program to compute the difference between two dates in hours,
            // minutes, milliseconds, and nanoseconds.
        /*LocalDateTime time = LocalDateTime.of(2020,5,20,3,56,15,30);
        LocalDateTime now = LocalDateTime.now();
        long nano = Duration.between(time,now).getNano();
        long milliseconds = Duration.between(time,now).toMillis();
        long seconds = Duration.between(time,now).getSeconds();
        long minute = Duration.between(time,now).toMinutes();
        long hour = Duration.between(time,now).toHours();
        System.out.println("Difference between "+hour+" Hours, "+minute+" minutes,"+seconds+" Seconds, "+milliseconds+" milliseconds, "+nano+" nanoseconds.");*/

        //Q129. Write a Java program to calculate your age.
        /*LocalDate birthDate = LocalDate.of(2004,2,8);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate,today);
        System.out.println("I am "+age.getYears()+" Years, "+age.getMonths()+" Months, "+age.getDays()+" Days old.");*/

        //Q130. Write a Java program to get the next and previous Fridays.
        /*LocalDate date = LocalDate.now();
        System.out.println("Next Friday: "+date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));*/

        //Q131. Write a Java program to get today's date at midnight time.
        /*Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        System.out.println(cal.getTime());*/

        //Q132. Write a Java program to extract date and time from the date string.
        /*try{
            String s = "2015-02-08  11:35:09";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
            String newFormat = new SimpleDateFormat("dd/MM/yyyy H:mm:ss").format(date);
            System.out.println(newFormat);
        } catch (ParseException e){
            e.printStackTrace();
        }*/

        //Q133. Write a Java program to convert a Unix timestamp to a date.
        /*long unixSeconds = 457668775L;
        Date date = new Date(unixSeconds * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String jDate = sdf.format(date);
        System.out.println(jDate);*/

        //Q134. Write a Java program to find seconds since 1970.
        /*LocalDateTime time = LocalDateTime.of(1970,1,1,0,0,0);
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Seconds since 1970: "+Duration.between(time,today).getSeconds()+" Seconds");*/

        //Q135. Write a Java program to convert String to date and time and vice versa.
        /*System.out.println("Convert Local Date to String: ");
        LocalDate date = LocalDate.parse("2023-04-15");
        String string = date.toString();
        System.out.println("LocalDate: "+string+" (Year: "+date.getYear()+", Month: "+date.getMonthValue()+", Days: "+date.getDayOfMonth()+").");*/

        //Q136. Write a Java program to display current date without time and current time without
            // date.
        /*LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Date without Time: "+date);
        System.out.println("Time without Date: "+time);*/

        //Q137. Write a Java program to combine local date and time into a single object.
        /*LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Combine local date and time: "+dateTime);*/

        //Q138. Write a Java program to define a period of time using date-based values (Period)
            // and a duration of time using time-based values (Duration).
        /*Period inDays = Period.ofDays(210);
        System.out.println("Period Of Days: "+inDays);
        Period inWeeks = Period.ofWeeks(21);
        System.out.println("Period Of Weeks: "+inWeeks);
        Period inMonth = Period.ofMonths(12);
        System.out.println("Period Of Month: "+inMonth);
        Period inYear = Period.ofYears(12);
        System.out.println("Period Of Year: "+inYear);
        Period inUnits = Period.of(20,5,24);
        System.out.println("Period Of Units: "+inUnits);

        Duration inMillis = Duration.ofMillis(1222222L);
        System.out.println("Duration in Millis: "+inMillis);
        Duration inSeconds = Duration.ofSeconds(50,567L);
        System.out.println("Duration in Seconds: "+inSeconds);
        Duration inMinutes = Duration.ofMinutes(45);
        System.out.println("Duration in Minutes: "+inMinutes);
        Duration inHours = Duration.ofHours(5);
        System.out.println("Duration in Hours: "+inHours);*/

        //Q139. Write a Java program to print yyyy-MM-dd, HH:mm:ss, yyyy-MM-dd HH:mm:ss,
            // E MMM yyyy HH:mm:ss.SSSZ and HH:mm:ss,Z format pattern for date and time.
        /*LocalDate pattern1 = LocalDate.now();
        DateTimeFormatter pat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String patt1 = pat1.format(pattern1);
        System.out.println("Pattern 1(yyyy-MM-dd): "+patt1);

        LocalTime pattern2 = LocalTime.now();
        DateTimeFormatter pat2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String patt2 = pat2.format(pattern2);
        System.out.println("Pattern 2(HH:mm:ss): "+patt2);

        LocalDateTime pattern3 = LocalDateTime.now();
        DateTimeFormatter pat3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String patt3 = pat3.format(pattern3);
        System.out.println("Pattern 3(yyyy-MM-dd HH:mm:ss): "+patt3);

        ZonedDateTime pattern4 = ZonedDateTime.now();
        DateTimeFormatter pat4 = DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
        String patt4 = pat4.format(pattern4);
        System.out.println("Pattern 4(E MMM yyyy HH:mm:ss.SSSZ): "+patt4);

        ZonedDateTime pattern5 = ZonedDateTime.now();
        DateTimeFormatter pat5 = DateTimeFormatter.ofPattern("HH:mm:ss Z");
        String patt5 = pat5.format(pattern5);
        System.out.println("Pattern 5(HH:mm:ss Z): "+patt5);*/

        //Q140. Write a Java program to count the number of days between two years.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Year: ");
        int firstYear = sc.nextInt();
        System.out.print("Enter End Year: ");
        int lastYear = sc.nextInt();
        if(lastYear > firstYear){
            for (int i = firstYear; i <= lastYear; i++) {
                System.out.println("Year "+i+" : "+isLeapYear(i)+" Days.");
            }
        }
        else {
            System.out.println("End is greater than start year!");
        }
    }
}
