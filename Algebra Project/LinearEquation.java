public class LinearEquation {
    double a;
    double b;
    double c;

    //ax + by + c = 0
    //-mx + 1y + (mx1 - y1) = 0
    public static boolean areValidParams(double a, double b) {
        if (a == 0 & b == 0)
            return false;

        return true;
    }

    public LinearEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public LinearEquation(double slope, Coords point) {
        a = -slope;
        b = 1;
        c = slope * point.getX() - point.getY();
        //this.(-slope,1,slope*point.getX() - point.getY());
    }

    public LinearEquation(LinearEquation other) {
        /*this.a = other.a;
        this.b = other.b;
        this.c = other.c;*/
        this(other.a, other.b, other.c);
    }

    public LinearEquation(Coords point1, Coords point2) {
        if (point1.getX() == point2.getX()) {
            a = 1;
            b = 0;
            c = -point1.getX();
        } else {
            double slope = point1.getSlopeOfLineSegment(point2);
            a = -slope;
            b = 1;
            c = slope * point1.getX() - point1.getY();
        }
    }

    public LinearEquation(LinearEquation other, Coords point)
    {
       if (other.slopeDefined()) {
            double slope = other.slope();
            a = -slope;
            b = 1;
            c = slope * point.getX() - point.getY();
        } else {
            a = 1;
            b = 0;
            c = -point.getX();
        }

     /*   if(other.isVertical())
        {
            a = 1;
            b = 0;
            c = -point.getX();
        }
        else
        {

        }
        */


    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean slopeDefined()
    {
        if (b != 0)
            return true;
        return false;
    }

    public boolean hasYIntercept() {
        if (slopeDefined())
            return true;
        return false;
    }

    public boolean hasXIntercept() {
        return slopeDefined();
    }

    public double slope() {
        return (-a / b);
    }

    public double yIntercept() {
        return (-c / b);
    }

    public double xIntercept() {
        return (-c / a);
    }

    public double slopeOfPerpendicularLine() {
        return -(b / -a);
    }

    public boolean isIncreasing() {
        if (slope() > 0)
            return true;
        return false;
    }

    public boolean isDecreasing() {
        if (slope() < 0)
            return true;
        return false;
    }

    public boolean isHorizontal() {
        if (slope() == 0)
            return true;
        return false;
    }

    public boolean isVertical()
    {
        return(slope() == Double.NaN);
    }

    public boolean isAFunction() {
        if (!slopeDefined())
            return false;
        return true;
    }

    public boolean isValidLinearEquation()
    {
        if (a!= 0 || b != 0)
            return true;
        else
            return false;
    }

    public boolean isDirectVariation()
    {
        if(this.yIntercept() == 0)
            return true;
        return false;
    }

    public boolean equals(LinearEquation other) {
        if (this.slope() == other.slope())
            if (this.yIntercept() == other.yIntercept())
                return true;

        return false;
    }

    public LinearEquation parallellLine(Coords point)
    {
        return new LinearEquation(this.slope(),point);
    }

    public LinearEquation perpendicularLine(Coords point)
    {
        if(this.isHorizontal())
            return new LinearEquation(1, 0 , -1 * point.getX());
        if(this.isVertical())
            return new LinearEquation(0,1, -1 * point.getX());
        return new LinearEquation(this.slopeOfPerpendicularLine(), point);
    }

    public double shortestDistanceFrom(Coords point)
    {
        double tempSlope = this.slopeOfPerpendicularLine();
        LinearEquation perpenEqn= new LinearEquation(tempSlope,point);

        Coords intersect = pointOfIntersection(perpenEqn);
        return intersect.distanceFrom(point);
    }

    public LinearEquation inverseFunction() //ax + by + c = 0 >> //ay + bx + c
    {
        return new LinearEquation(b, a, c);

    }

    public boolean isParallelTo (LinearEquation other)
    {
        return (this.slope() == other.slope());
    }

    public boolean isPerpendicular(LinearEquation other)
    {
        if(this.slopeOfPerpendicularLine() == other.slope())
            return true;
        return false;
    }
    public String toString()
    {
        String output = a + "x" + b + "y" + c + " = 0";
        return output;
    }
    public String getSlopeInterceptForm()
    {
        return "y = " + this.slope() + "x" + this.yIntercept();
    }

    public Coords pointOfIntersection(LinearEquation other)
    {
        if(!this.isValidLinearEquation() || !other.isValidLinearEquation())
            return null;

        if(this.isVertical() && other.isVertical())
            return null;

        if(this.isVertical() && other.isHorizontal())
            return new Coords(this.xIntercept(), other.yIntercept());

        if(this.isHorizontal() && other.isVertical())
            return new Coords(other.xIntercept(), this.yIntercept());

        if(this.slope() == other.slope())
            return null;


        double a1 = this.a;
        double b1 = this.b;
        double c1 = this.c;
        double a2 = other.a;
        double b2 = other.b;
        double c2 = other.c;
        /*a1x + by1 + c1 = 0
            a1x = -by1 - c1
            x = -by1 - c1/(a1)*/
        double y = (a1 * c2 - a2 * c1) / (a2 * b1 - a1 * b2);

        double x = ((-b * y) - c1) / (a1);
        return new Coords(x, y);
    }
}



