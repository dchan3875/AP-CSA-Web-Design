import java.util.List;

public abstract class Shape implements Comparable<Shape> // must have a compareTo
{
    private String name;

    public Shape(String theName) {
        name = theName;
    }

    public abstract double area();

    public abstract double perimeter();

    public double semiPerimeter() {
        return perimeter() / 2;
    }

    public int compareTo(Shape other) {
        if (this.area() < other.area())
            return -1;

        if (this.area() > other.area())
            return 1;
        //by this point, area must be same
        if (this.perimeter() < other.perimeter())
            return -1;

        if (this.perimeter() > other.perimeter())
            return 1;

        return 0;
    }

    public static void sortByAreaPerimeter(List<Shape> theShapes)
    {
        for (int i = 0; i < theShapes.size() - 1; i++)
        {
            int lowPosition = i;
            for (int j = i + 1; j < theShapes.size(); j++)
            {
                if (theShapes.get(j).compareTo(theShapes.get(lowPosition)) < 0)
                {
                    lowPosition = j;
                }
            }
            theShapes.set(i, theShapes.set(lowPosition, theShapes.get(i)));
        }
    }

    public String toString ()
    {
        return name + ": AREA = " + area() + ", PERIMETER = " + perimeter();
    }
}
