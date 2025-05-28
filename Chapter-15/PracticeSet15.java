import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PracticeSet15 {
    public static void main(String[] args) {
        //Question 1. Create an ArrayList and store the names of ten students inside it.
                    // Print it using a for each loop.
        ArrayList<String > stdName = new ArrayList<>();
        stdName.add("Kunal");
        stdName.add("Aditya");
        stdName.add("Chetan");
        stdName.add("Riya");
        stdName.add("Chaitali");
        stdName.add("Roshan");
        stdName.add("Tejas");
        stdName.add("Rahul");
        stdName.add("Baban");
        stdName.add("Diksha");
        for (String e: stdName){
            System.out.println(e);
        }

        //Question 2. Use the Date class in Java to print the time in the following format : 21:47:02.
        /*Date date = new Date();
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());*/

        //Question 3. Repeat Q2 using the Calendar class.
        /*Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));*/

        //Question 4. Repeat Q2 using java.time API.
        /*LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String myTime = dtf.format(ldt);
        System.out.println(myTime);*/

        //Question 5. Create a Set in java. Try to store the duplicate values elements inside
                    // this set and verify that only one instance is stored.
        /*HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(7);
        hashSet.add(5);
        hashSet.add(8);
        System.out.println(hashSet);*/
    }
}
