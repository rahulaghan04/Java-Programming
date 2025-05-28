//Question 1: Create a class Circle and use inheritance to create another class Cylinder from it.
/*class Circle1{
    public int radius;
    Circle1(){
        System.out.println("This is circles Unparameterized constructor.");
    }
    Circle1(int r){
        System.out.println("This is circles parameterized constructor.");
        this.radius = r;
    }
//    public double area(){
//        return Math.PI * this.radius * this.radius;
//    }
//    public double volume(){
//        return 2 * Math.PI * this.radius;
//    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        //super(r);
        System.out.println("This is Cylinders parameterized constructor.");
        this.height = h;
    }
//    public double area(){
//        return 2 * Math.PI * this.radius * (this.radius + this.height);
//    }
//    public double volume(){
//        return Math.PI * (this.radius * this.radius) * this.height;
//    }
}*/

//Question 2: Create a class Rectangle and use inheritance to create another class cuboid.
            // Try to keep it as close to real world scenario as possible.
/*class Rectangle{
    public int width;
    public int height;
    Rectangle(){
        System.out.println("This is rectangles Unparameterized constructor.");
    }
    Rectangle(int w){
        System.out.println("This is rectangles one parameterized constructor.");
        this.width = w;
    }
    Rectangle(int w, int h){
        System.out.println("This is rectangles parameterized constructor.");
        this.width = w;
        this.height = h;
    }
}
class Cuboid extends Rectangle{
    public int length;
    Cuboid(int w, int h, int l){
        super(w,h);
        System.out.println("This is cuboids parameterized constructor.");
    }
}*/

//Question 3: Create methods for area and volume in Q1.
/*class Circle2{
    public int radius;
    Circle2(){
        System.out.println("This is circles Un parameterized constructor.");
    }
    Circle2(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
    public double volume(){
        return 2 * Math.PI * this.radius;
    }
}
class Cylinder2 extends Circle2{
    public int height;
    Cylinder2(int r, int h){
        super(r);
        System.out.println("This is Cylinders parameterized constructor.");
        this.height = h;
    }
    @Override
    public double area(){
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }
    @Override
    public double volume(){
        return Math.PI * (this.radius * this.radius) * this.height;
    }
}*/

//Question 4: Create methods for area & volume in Q2. Also creates getters and setters.
class Rectangle2{
    public int width;
    public int height;
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    Rectangle2(){
        System.out.println("This is rectangles Un parameterized constructor.");
    }
    Rectangle2(int w, int h){
        this.width = w;
        this.height = h;
    }
    public double surfaceArea(){
        return this.width * this.height;
    }
    public double volume(){
        return 2 * (this.width * this.height);
    }
}
class Cuboid2 extends Rectangle2{
    public int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    Cuboid2(){
        System.out.println("This is rectangles Un parameterized constructor.");
    }
    Cuboid2(int l){
        this.height = l;
    }
    Cuboid2(int w, int h, int l){
        super(w,h);
        this.length = l;
    }
    @Override
    public double surfaceArea(){
        return 2 * (this.length * this.width + this.width * this.height + this.length * this.height);
    }
    @Override
    public double volume(){
        return this.length * this.width * this.height;
    }
}

public class PracticeSet10 {
    public static void main(String[] args) {

        //Q1
        /*Circle1 circle1 = new Circle1();
        Cylinder1 cylinder1 = new Cylinder1(2,5);*/

        //Q2
        /*Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(3,4);
        Cuboid cuboid = new Cuboid(3,3,6);*/

        //Q3
        /*Circle2 circle2 = new Circle2(3);
        System.out.println("Area of Circle: "+circle2.area());
        System.out.println("Volume of Circle: "+circle2.volume());
        System.out.println();
        Cylinder2 cylinder2 = new Cylinder2(2,5);
        System.out.println("Area of Cylinder: "+cylinder2.area());
        System.out.println("Volume of Cylinder: "+cylinder2.volume());*/

        //Q4
        Rectangle2 rectangle2 = new Rectangle2(2,6);
        //Rectangle2 rectangle2 = new Rectangle2();
        rectangle2.setWidth(5);
        rectangle2.setHeight(8);
        System.out.println("The width of Rectangle is "+rectangle2.getWidth()+" and height is "+rectangle2.getHeight());
        System.out.println("Surface Area of Rectangle: "+rectangle2.surfaceArea());
        System.out.println("Volume of Rectangle: "+rectangle2.volume());
        System.out.println();

        //Cuboid2 cuboid2 = new Cuboid2();
        Cuboid2 cuboid2 = new Cuboid2(4,4,4);
        cuboid2.setWidth(4);
        cuboid2.setHeight(4);
        cuboid2.setLength(4);
        System.out.println("The width of Cuboid is "+cuboid2.getWidth()+" and height is "+cuboid2.getHeight()+" and length is "+cuboid2.getLength());
        System.out.println("Surface Area of Cuboid: "+cuboid2.surfaceArea());
        System.out.println("Volume of Cuboid: "+cuboid2.volume());
    }
}
