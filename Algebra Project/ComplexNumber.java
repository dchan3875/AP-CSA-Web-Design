public class ComplexNumber
{
    //a + bi
    private double a;
    private double b;

    public ComplexNumber(double realPart, double imaginaryPart)
    {
        a = realPart;
        b = imaginaryPart;
    }
    public ComplexNumber(ComplexNumber other)
    {
        this.a = other.a;
        this.b = other.b;
    }

    public double getRealMagnitude()
    {
        return Math.abs(a);
    }
    public double getImaginaryMagnitude()
    {
        return Math.abs(b);
    }
    public String toString()
    {
        String output = "";

        if(a != 0 && b != 0)
        {
            output = a + " + " + b + "i";
        }
        else
        {
            if(a == 0)
            {
                output = b + "i";
            }
            else
            {
                if(b == 0)
                {
                    output += a;
                }
                else
                {
                    output = "0";
                }
            }
        }
        return output;
    }

    public void add (double scalar)
    {
        this.a = this.a + scalar;
    }
    public void add (ComplexNumber other)
    {
        this.b = this.b + other.b;
    }
    public void subtract(double scalar)
    {
        this.a = this.a - scalar;
    }
    public void subtract(ComplexNumber other)
    {
        this.a = this.a - other.a;
        this.b = this.b - other.b;
    }
    public void multiply(double scalar)
    {
        this.a = this.a * scalar;
        this.b = this.b * scalar;
    }
    public void multiply(ComplexNumber other)
    {
        double c = other.a;
        double d = other.b;
        double tempA = this.a;

        a = ((a*c) - (b*d));
        b = ((tempA*d) + (b*c));
    }
    public boolean divideBy(double scalar)
    {
        if(scalar != 0)
        {
            this.a = this.a/scalar;
            this.b = this.b/scalar;

            return true;
        }
        return false;
    }
    public boolean divideBy(ComplexNumber other)
    {
        double c = other.a;
        double d = other.b;
        double tempA = this.a;
        if(c != 0 && d != 0)
        {
            this.a = ((a*c) + (b*d))/((Math.pow(c,2) + Math.pow(d,2)));
            this.b = ((b*c) - (tempA*d))/((Math.pow(c,2) + Math.pow(d,2)));
            return true;
        }
        return false;
    }
}
