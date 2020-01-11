public class Circle extends Shape //inherits instance variables and methods but not abstract methods or constructor from Shape
{
    private double radius;

    public Circle(double radius, String theName)
    {
        super(theName); //calls parents constructor from Shape, MUST BE FIRST IN CIRCLE CONSTRUCTOR
        this.radius = radius;
    }
    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    //Circle inherits the toString() from Shape, so can call
}
