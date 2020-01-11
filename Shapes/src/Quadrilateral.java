public abstract class Quadrilateral extends Shape
{
    private double side1, side2, side3, side4;

    public Quadrilateral(double side1, double side2, double side3, double side4, String theName)
    {
        super(theName);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
    public Quadrilateral(double side1, double side2, String theName)
    {
        this(side1, side2, side1, side2, theName);
    }
    public Quadrilateral(double side1, String theName)
    {
        this(side1, side1, side1, side1, theName);
    }
    public abstract double area(); //making quadrilateral and area abstract bc cannot generalize area for all quadrilaterals
    public double perimeter()
    {
        return side1 + side2 + side3 + side4;
    }

    //ACCESSORS
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    public double getSide4()
    {
        return side4;
    }

}
