//Question 1. Create an abstract class Pen with methods write() and refill() as abstract methods.
/*abstract class Pen{
    abstract void write();
    abstract void refill();
}*/

//Question 2. Use the Pen Class from Q1 to create a concrete class fountainPen with additional
            // method changeNib().
/*abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Write");
    }
    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change the Fountain Pen Nib.");
    }
}*/

//Question 3. Create a class Monkey with jump() and bite() methods. Create a class Human which
            // inherits this monkey class and implements BasicAnimal interface with eat() and
            // sleep() methods.
/*interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping.....");
    }
    public void bite(){
        System.out.println("Biting.....");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello, Sir");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}*/

//Question 4. Create a Class Telephone with ring(), lift() and disconnect() methods as
            // abstract methods. Create another Class SmartTelephone and demonstrate
            // polymorphism.
/*abstract class Telephone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void lift(){
        System.out.println("Lifting.");
    }
    public void disconnect(){
        System.out.println("Disconnect.");
    }
}
class SmartTelephone extends Telephone{
    public void setRingtone(){
        System.out.println("Ishare tere...");
    }
    public void checkBalance(){
        System.out.println("Check Balance.");
    }
}*/

//Question 5. Demonstrate Polymorphism using Monkey class from Q3.
//Check Question 3 ans.

//Question 6. Create an interface TVRemote and use it to inherit another Interface SmartTVRemote.
interface TVRemote{
    void changeChannel();
    void changeNextChannel();
    void changePreviousChannel();
    void backChannel();
}
interface SmartTVRemote extends TVRemote{
    void openYoutube();
    void openNetflix();
    void openFacebook();
    void playVideoGame();
}
class TV implements TVRemote, SmartTVRemote{
    @Override
    public void changeChannel() {
        System.out.println("Changing Channel");
    }
    @Override
    public void changeNextChannel() {
        System.out.println("Change Next Channel");
    }
    @Override
    public void changePreviousChannel() {
        System.out.println("Change Previous Channel");
    }
    @Override
    public void backChannel() {
        System.out.println("Change Back Channel");
    }
    @Override
    public void openYoutube() {
        System.out.println("Open YouTube");
    }
    @Override
    public void openFacebook() {
        System.out.println("Open Facebook");
    }
    @Override
    public void openNetflix() {
        System.out.println("Open Netflix");
    }
    @Override
    public void playVideoGame() {
        System.out.println("Use to Play Games as a Controller.");
    }
}
//Question 7. Create an Class TV which implements TVRemote interface from Q6.
//Check Q6 Ans.
public class PracticeSet11 {
    public static void main(String[] args) {
        //Q1 & Q2
        /*FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();*/

        //Q3
        /*Human human = new Human();
        human.speak();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();*/

        //Q4
        /*SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.ring();
        smartTelephone.lift();
        smartTelephone.disconnect();
        smartTelephone.checkBalance();
        smartTelephone.setRingtone();
        //polymorphism
        Telephone telephone = new SmartTelephone();
        //telephone.checkBalance(); //telephone class ke liye methods allowed nhi hai.
        //telephone.setRingtone();
        telephone.ring();
        telephone.lift();
        telephone.disconnect();*/

        //Q5
        /*Monkey monkey = new Human();
        //monkey.speak();--->Cannot use speak method because the reference is monkey which does not have speak method.
        monkey.jump();
        monkey.bite();
        BasicAnimal moti = new Human();
        //moti.speak();--->Cannot use speak method because the reference is BasicAnimal which does not have speak method.
        moti.sleep();
        moti.eat();*/

        //Q6 & Q7
        /*SmartTVRemote smartTVRemote = new TV();
        smartTVRemote.changeChannel();
        smartTVRemote.changeNextChannel();
        smartTVRemote.changePreviousChannel();
        smartTVRemote.backChannel();
        smartTVRemote.openYoutube();
        smartTVRemote.openFacebook();
        smartTVRemote.openNetflix();
        smartTVRemote.playVideoGame();

        //polymorphism
        TVRemote tvRemote = new TV();
        //tvRemote.openYoutube();-->it is not allow because openYoutube is not method of TVRemote.
        //tvRemote.openFacebook();-->it is not allow because openFacebook is not method of TVRemote.
        //TV tv = new TVRemote(); //error
        //TV tv = new SmartTVRemote(); //error*/
    }
}
