//Question 1. WAP to print "Good Morning" and "Welcome" continuously on the screen in java
            // using threads.
/*class Q1Thread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning.");
        }
    }
}
class SubQ1Thread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Welcome");
        }
    }
}*/

//Question 2. Add a sleep method in welcome thread of Q1 to delay its execution for 200ms.
/*class Q2Thread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning.");
        }
    }
}
class SubQ2Thread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
        }
    }
}*/

//Question 3. Demonstrate getPriority() and setPriority() methods in java Threads.
/*class Q3Thread extends Thread{
    public Q3Thread(String name){
        super(name);
    }
    public void run(){
        int i = 5;
        while (i <= 400) {
            System.out.println("Thank you!, " + this.getName());
            i++;
        }
    }
}*/

//Question 4. How do you get state of a given thread in java?.
/*class Q4Thread extends Thread{
    public Q4Thread(String name){
        super(name);
    }
    public void run(){
//        while (false) {
//            System.out.println("Thank you!, " + this.getName());
//        }
    }
}
class SubQ4Thread extends Thread{
    public SubQ4Thread(String name){
        super(name);
    }
    public void run(){
        while (true) {
            System.out.println("Thank you!, " + this.getName());
        }
    }
}*/

//Question 5. How do you get reference to the current thread in java?.
class Q5Thread extends Thread{
    public Q5Thread(String name){
        super(name);
    }
    public void run(){
//        while (false) {
//            System.out.println("Thank you!, " + this.getName());
//        }
    }
}
class SubQ5Thread extends Thread{
    public SubQ5Thread(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while (i <= 30) {
            System.out.println("Thank you!, " + this.getName());
            i++;
        }
    }
}
public class PracticeSet13 {
    public static void main(String[] args) {
        //Q1
        /*Q1Thread t1 = new Q1Thread();
        SubQ1Thread t2 = new SubQ1Thread();
        t1.start();
        t2.start();*/

        //Q2
        /*Q2Thread t1 = new Q2Thread();
        SubQ2Thread t2 = new SubQ2Thread();
        t1.start();
        t2.start();*/

        //Q3
        /*Q3Thread t1 = new Q3Thread("Devendra");
        Q3Thread t2 = new Q3Thread("Omkar");
        Q3Thread t3 = new Q3Thread("Pratik");
        t1.setPriority(10);
        t2.setPriority(9);
        t3.setPriority(8);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());*/

        //Q4
        /*Q4Thread t1 = new Q4Thread("Devendra");
        SubQ4Thread t2 = new SubQ4Thread("Omkar");
        t1.setPriority(10);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.start();*/

        //Q5
        Q5Thread t1 = new Q5Thread("Devendra");
        SubQ5Thread t2 = new SubQ5Thread("Omkar");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(Thread.currentThread().getState());
    }
}
