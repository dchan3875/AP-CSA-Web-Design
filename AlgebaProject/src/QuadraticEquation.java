public class QuadraticEquation
{
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation()
    {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(QuadraticEquation other)
    {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
    }

    public QuadraticEquation(double coefficient, Coords vertex)
    {
       this(coefficient, -2*coefficient*vertex.getX(), coefficient*Math.pow(vertex.getX(),2) + vertex.getY());
        //b = -2ah

    }

    public Coords vertex()
    {
        double xVert = -b/(2*a);
        return new Coords(xVert, a*Math.pow((xVert),2) + b * xVert + c);
    }
    public LinearEquation axisOfSymmetry()
    {
      //  double vert = -b/(2*a);
        return new LinearEquation(1, 0, (b/2*a));
    }
    public LinearEquation derivative()
    {
        return new LinearEquation(2*a, -1, b);
    }
    public QuadraticRoots getRoots()
    {
        double realP1 = -b/(2*a) + getDiscriminant();
        double realP2 = -b/(2*a) - getDiscriminant();

        if(hasRealRoots())
        {
            return new QuadraticRoots(realP1, realP2);
        }
        double imaginary1 = (Math.sqrt(getDiscriminant()))/(2*a);
        ComplexNumber root1 = new ComplexNumber(-b/(2*a), imaginary1);

        return(new QuadraticRoots(root1));
    }
    public double getDiscriminant()
    {
        return (Math.pow(b,2) - 4 * a * c);
    }
    public boolean hasRealRoots()
    {
        if (getDiscriminant() > 0)
            return true;
        else
            return false;
    }
    public boolean hasEqualRoots()
    {
        if(hasRealRoots())
        {
            if(getRoots().getRoot1() == getRoots().getRoot2())
                    return true;
        }
        return false;
    }
    public boolean hasMinimum()
    {
        if(a > 0)
            return true;
        return false;
    }
    public boolean hasMaximum()
    {
        if(a < 0)
            return true;
        return false;
    }
    public String toString()
    {
        return a + "x^2" + b + "x" + c;
    }

}
