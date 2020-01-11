public class Coords
{
    private double x;
    private double y;

    public Coords(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Coords(double value)
    {
        //this.x = value;
        //this.y = value;
        this(value,value);
    }
    public Coords()
    {
        //this.x = 0;
        //this.y = 0;
        this(0); //(0,0)
    }
    public Coords(Coords other)
    {
        //this.x = other.x;
        //this.y = other.y;
        this(other.x,other.y);
    }

    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public String toString()
    {
        String output = "(" + this.x + "," + this.y + ")";
        return output;
}

    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public void reflectOnXAxis()
    {
        y = -y;
    }
    public void reflectOnYAxis()
    {
        x = -x;
    }
    public void reflectOnOrigin()
    {
        x = -x;
        y = -y;
    }
    public void translate(double horizontal, double vertical)
    {
        x = x + horizontal;
        y = y + vertical;
    }
    public void dilate(double dilationFactor)
    {
        x = x * dilationFactor;
        y = y * dilationFactor;
    }

    public double distanceFromOrigin()
    {
        return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
    }
    public double distanceFrom(Coords other)
    {
        return Math.sqrt((Math.pow(other.getX() - x, 2) + Math.pow(other.getY() - y, 2)));
    }
    public boolean equals(Coords other)
    {
        if(this.x == other.x && this.y == other.y)
        {
            return true;
        }
        return false;
    }
    public double getSlopeOfLineSegment(Coords other)
    {
       return (other.y - y)/(other.x - x);
    }
    public boolean slopeOfLineSegmentDefined(Coords other) //NaN = not a number, infinity or -infinity
    {
        return (this.x != other.x);
    }

}

