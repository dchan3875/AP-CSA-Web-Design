/*public class DiceProbability
{
   private int[] distribution;
   private double[] theoreticalProb;
   private int numberOfRolls;
   private PairOfDice myDice;

   public DiceProbability(int numOfRolls)
   {

       numberOfRolls = numOfRolls;
       myDice = new PairOfDice();

       int sides1 = myDice.getDie1().getNumOfSides();
       int sides2 = myDice.getDie2().getNumOfSides();
       distribution = new int[sides1 + sides2 + 1];

       int rollsSoFar = 0;

       while (rollsSoFar < numberOfRolls)
       {
          distribution[myDice.roll()]++; //adds 1 to that idx each time
          rollsSoFar++;
       }
       theoreticalProb = getTheoreticalProb();
       printDistribution();
   }

   public int[] getTheoreticalProb(int s1, int s2)
   {
       int[] theoreticalOutcome = new int[distribution.length];


       for(int i = 1; i < s1; i++)
       {
           for (int j = 1; j < s2; j++)
           {
               theoreticalOutcome[i + j]++;
           }
       }

       int numOfOutcomes = s1*s2;

       for(int i = 2; i < theoreticalOutcome.length; i++)
       {
           theoreticalProb[i] = theoreticalOutcome[i]/(double)numOfOutcomes;
       }
        //return theoreticalProb;
   }

   public void printDistribution()
   {
       for (int i = 2; i < distribution.length; i++)
       {
           System.out.print("OUTCOME[" + i + "] = ");
           System.out.println(distribution[i] + " OR " + (distribution[i]/(double)numberOfRolls + ", " +theoreticalProb[i]));
         //  System.out.print("Theoretical Probability: " +
       }
   }
}
*/