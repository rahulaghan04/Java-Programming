public class PracticeSet3 {
    public static void main(String[] args){
        //Question 1: WAP to convert a string to lowercase
        String name = "Jay Shree Ram";
        String value = name.toLowerCase();
        System.out.println(value);

        //Question 2: WAP to Replace spaces with underscores
        String text = "Jay Shree Ram";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Question 3: WAP to fill in a letter template which looks like below:
                    //letter = "Dear |<name>|, Thanks a lot." replace name with a string(some name)
        String letter = "Dear |<name>|, Thanks a lot";
        letter = letter.replace("|<name>|","Rahul");
        System.out.println(letter);

        //Question 4: WAP to detect double spaces and triple spaces in a string
        String myString = "Hello,  my name Rahul and   I am form Pen.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Question 5: WAP to format the following letter using escape sequence characters
                    //letter = "Dear Harry, This Java Course is nice. Thanks!"
        System.out.println("Dear Harry,\n\tThis Java Course is nice.\n\tThanks!");
    }
}
