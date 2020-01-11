public class NumberCube
{
    private int numOfSides; //instance variable, can only access inside this class default value of 0 every cube has
    public static final int MIN_SIDES = 4;
    public static final int MAX_SIDES = 20; //final cannot be changed, make static bc all cubes share
    public static final int DEFAULT_SIDES = 6;
    //publicNumberCube() created when no other constructors (DEFAULT)

    public NumberCube() //in case no sides given CONSTRUCTOR, same name as class always
    {
        numOfSides = DEFAULT_SIDES;
    }

    public NumberCube(int sides) //constructor, not a default. overloading a constructorb
    {
        if (sides < MIN_SIDES || sides > MAX_SIDES)
        {
            numOfSides = DEFAULT_SIDES;
        }
        else
        {
            numOfSides = sides;
        }
    }

    public int roll() //constructors no return type, built obj of that class
    {
        return (int)(Math.random() * numOfSides) + 1;
    }

    public int getNumOfSides()
    {
        return numOfSides;
    }
}