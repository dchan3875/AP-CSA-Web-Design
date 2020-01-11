public class Triangle extends Shape
{
    private double a,b,c;

    public Triangle(double a, double b, double c, String theName)
    {
        super(theName);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area()
    {
        double s = semiPerimeter();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        //Heron's Formula
    }
    public double perimeter()
    {
        return a + b + c;
    }
    public boolean isIsoceles()
    {
        if(a == b || a == c || b == c)
            return true;
        return false;
    }
    public boolean isRightTriangle()
    {
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2))
        {
            return true;
        }
        return false;
    }
    public boolean isValidTriangle()
    {
        if(a + b > c || a + c > b || b + c > a)
            return true;
        return false;
    }
}
