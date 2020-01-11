public class PairOfDice
{
    private NumberCube die1;   //declared but value of null
    private NumberCube die2;

    public PairOfDice()
    {
        die1 = new NumberCube();  //die1 and die2 is numbercube datatype
        die2 = new NumberCube();
    }

    public PairOfDice(int sides1)
    {
        die1 = new NumberCube(sides1);
        die2 = new NumberCube(sides1);
    }

    public PairOfDice(int sides1, int sides2)
    {
        die1 = new NumberCube(sides1);
        die2 = new NumberCube(sides2);
    }

    public PairOfDice(PairOfDice other) //other = the user's already created pairofdice
    {
        this.die1 = other.die1;
        this.die2 = other.die2; //this refeers to instance
    }

    public PairOfDice(NumberCube cube) //duplicate a cube into a pair
    {
        die1 = cube;
        die2 = cube;
    }

    public PairOfDice(NumberCube cube1, NumberCube cube2)  //turn two number cubes into a pair
    {
        this.die1 = cube1;
        this.die2 = cube2;
    }

    public NumberCube getDie1()   //accessor
    {
        return die1;
    }
    public NumberCube getDie2()
    {
        return die2;
    }

    public int roll()
    {
        return die1.roll() + die2.roll(); //die val already int
    }

}
