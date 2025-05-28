//Question 1: Create a class Cylinder and use getters and setters to set its radius and height.
/*class Cylinder{
    private int radius;
    private int height;
    public void setRadius(int n){
        this.radius = n;
    }
    public void setHeight(int m){
        this.height = m;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}*/

//Question 2: Use Q1 to calculate surface area and volume of the cylinder.
/*class Cylinder1{
    private int radius;
    private int height;
    private double pie = 3.14159;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public double surfaceArea(){
        return 2 * pie * radius * (radius + height);
    }
    public double volume(){
        return pie * (radius * radius) * height;
    }
}*/

//Question 3: Use a constructor and repeat Q1.
/*class Cylinder3{
    private int radius;
    private int height;
    public Cylinder3(){
        radius = 10;
        height = 10;
    }
    public Cylinder3(int newRadius, int newHeight){
        radius = newRadius;
        height = newHeight;
    }
    public void setRadius(int n){
        this.radius = n;
    }
    public void setHeight(int m){
        this.height = m;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}*/

//Question 4: Overload a constructor used to initialize a rectangle of length 4 and breadth 5
            // for using custom parameters.
/*class Rectangle1{
    private int length;
    private int breadth;
    public Rectangle1(){
        length = 4;
        breadth = 5;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}*/

//Question 5: Repeat Q1 for a sphere.
class Sphere{
    private int radius;
    private float pie = 3.14159f;
    //already fix radius, if user not give radius.
    public Sphere(){
        radius = 4;
    }
    //custom radius
    public Sphere(int r) {
        this.radius = r;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double surfaceArea(){
        return 4 * pie * (radius * radius);
    }
    public float volume(){
        return (4/3f) * pie * (radius * radius * radius);
    }
}
public class PracticeSet9 {
    public static void main(String[] args) {
        //Q1
        /*Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        System.out.println("Radius of Cylinder is "+cylinder.getRadius());
        cylinder.setHeight(10);
        System.out.println("Height of Cylinder is "+cylinder.getHeight());*/

        //Q2
        /*Cylinder1 cylinder1 = new Cylinder1();
        cylinder1.setRadius(10);
        cylinder1.setHeight(10);
        System.out.println("Radius of Cylinder is "+cylinder1.getRadius()+" and Height is "+ cylinder1.getHeight());
        System.out.printf("Surface Area of Cylinder is: %.2f\n",cylinder1.surfaceArea());
        System.out.println("Volume of the Cylinder is: "+cylinder1.volume());*/

        //Q3
        /*Cylinder3 cylinder3 = new Cylinder3(15,6);
        System.out.println("Radius of Cylinder is "+cylinder3.getRadius());
        System.out.println("Height of Cylinder is "+cylinder3.getHeight());*/

        //Q4
        /*Rectangle1 rectangle1 = new Rectangle1();
        System.out.println("Height of the Rectangle is: "+rectangle1.getLength());
        System.out.println("Breadth of the Rectangle is: "+rectangle1.getBreadth());*/

        //Q5
        Sphere sphere = new Sphere(7);
        //sphere.setRadius(5);
        System.out.println("Radius of the Sphere is: "+sphere.getRadius());
        System.out.printf("Surface Area of the Sphere is: %.3f\n",sphere.surfaceArea());
        System.out.printf("Volume of the Sphere is: %.3f\n",sphere.volume());
    }
}
