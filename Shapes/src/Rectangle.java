public class Rectangle extends Quadrilateral
{
    public Rectangle(double length, double width, String theName)
    {
        super(length, width, theName);
    }
    public Rectangle(double length, String theName)
    {
        super(length, theName);
    }
    public double area()
    {
        return getSide1() * getSide2();   //accessor methods from quadrilateral
    }
    //perim from quadril
}
