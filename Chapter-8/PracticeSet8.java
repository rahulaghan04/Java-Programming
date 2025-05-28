//Question 1: Create a class employee with following properties an methods.
/*salary(property)(int)
getsalary(method returning int)
name(property)(string)
getname(method returning string)
setname(method changing name)*/
/*class Employee{
    String name;
    int salary;
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
}*/

//Question 2: Create a Class Cellphone with methods to print "ringing...","vibrating...", etc.
/*class CellPhone{
    public void ringing(){
        System.out.println("Ringing........");
    }
    public void vibrating(){
        System.out.println("Vibrating.........");
    }
    public void calling(){
        System.out.println("Calling Rahul..........");
    }
}*/

//Question 3: Create a class Square with a method to initialize its side, calculating area, perimeter, etc.
/*class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}*/

//Question 4: Same for Rectangle.
/*class Rectangle{
    int width;
    int height;
    public int area(){
        return width * height;
    }
    public int perimeter(){
        return 2 * (width + height);
    }
}*/

//Question 5: Create a class Carlo for Krafton Games capable to hitting(print hitting), running, firing, etc.
/*class Carlo{
    public void hit(){
        System.out.println("Hitting the Enemy..");
    }
    public void run(){
        System.out.println("Running from the enemy.");
    }
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
}*/

//Question 6: Repeat 4 for a Circle.
class Circle{
    float pie = 3.14f;
    float radius;
    public float area(){
        return pie * (radius * radius);
    }
    public float perimeter(){
        return 2 * pie * radius;
    }
}
public class PracticeSet8 {
    public static void main(String[] args) {
        // Q1
        /*Employee ramesh = new Employee();
        ramesh.setName("Ramesh Patil");
        ramesh.salary = 40000;
        System.out.println(ramesh.getName());
        System.out.println(ramesh.getSalary());*/

        //Q2
        /*CellPhone cellphone = new CellPhone();
        cellphone.calling();
        cellphone.ringing();
        cellphone.vibrating();*/

        //Q3
        /*Square square = new Square();
        square.side = 5;
        System.out.println("Side length of square is: "+square.side);
        System.out.println("Area of square is: "+square.area());
        System.out.println("Perimeter of square is: "+square.perimeter());*/

        //Q4
        /*Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 3;
        System.out.println("The width of rectangle is "+rectangle.width+" and height is "+rectangle.height);
        System.out.println("Area of rectangle is: "+rectangle.area());
        System.out.println("Perimeter of rectangle is: "+rectangle.perimeter());*/

        //Q5
        /*Carlo carlo = new Carlo();
        carlo.hit();
        carlo.run();
        carlo.fire();*/

        //Q6
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Radius of the Circle: "+circle.radius);
        System.out.println("Area of the Circle: "+circle.area());
        System.out.println("Perimeter of the Circle: "+circle.perimeter());
    }
}
