public class Test
{
    public static void main(String[] args)
    {
        /*  NumberCube dSix = new NumberCube(); //1-6

        NumberCube dTwelve = new NumberCube(12);
        int theRoll = dTwelve.roll();

        System.out.println(theRoll);
        */
       // PairOfDice myDice = new PairOfDice(); // die 1 and die2 are null
       // DiceProbability dp1 = new DiceProbability(1000);
        int[] test = {2, 4, 6, 8, 10, 12, 13};
        int first = 1;
        int last = 3;
        int sum = 9;
        double avg = 9.0/(last - first);
        for(int i = 1; i < test.length; i++)
        {
            System.out.println(test[i] - test[i++]);
            System.out.println(avg);
        }

    }
}
