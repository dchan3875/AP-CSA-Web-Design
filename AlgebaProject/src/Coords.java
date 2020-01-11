import java.util.ArrayList;

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
        //this.y = value;   calls above function
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
    public static Coords getPointClosestToOrigin(ArrayList<Coords> points)
    {
        Coords closest = points.get(0);

        for(Coords p : points)
        {
            if(p.distanceFromOrigin() < closest.distanceFromOrigin())
            {
                closest = p;
            }
        }
        return closest;

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
        //negate both values
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
        //dilate coords
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

    public int compareTo(Coords other)
    {
        if (this.x == other.x)
        {
            //if this preceds other, it returns negative
            if(this.y < other.y)
            {
                return -1;
            }
            if(this.y > other.y)
            {
                return 1;
            }
            return 0;
        }
        if (this.x < other.x)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public static void sortCoords(Coords[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j].compareTo(arr[lowPosition]) < 0)
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition,arr);
        }
    }

    private static void swap(int indexA, int indexB, Coords[] arr)
    {
        Coords temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void sortCoordsByDistanceFromOrigin(Coords[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j].compareByDistanceFromOrigin(arr[lowPosition]) < 0)
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition,arr);
        }
    }

    public int compareByDistanceFromOrigin(Coords other)
    {
        if(this.distanceFromOrigin() == other.distanceFromOrigin())
            return 0;
        if(this.distanceFromOrigin() < other.distanceFromOrigin())
            return -1;
        return 1;
    }
    public int compareByDistanceFromThisCoords(Coords p1, Coords p2)
    {
        if(this.distanceFrom(p1) == other.distanceFromOrigin())
            return 0;
        if(this.distanceFromOrigin() < other.distanceFromOrigin())
            return -1;
        return 1;
        //neg if p1 closer to this
        // pos if p2 cloer
        //0 if equidis
    }

    public static void printArr(Coords[] arr)
    {
        for(Coords p : arr)
        {
            System.out.print(p + ", ");
        }
        System.out.println();
    }
}

