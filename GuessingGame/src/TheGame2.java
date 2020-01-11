import java.util.Scanner;
import java.util.ArrayList;
            // ALL ENHANCEMENTS VERSION
public class TheGame2
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Welcome to the Guessing Game. What level would you like to play? (1-4)");
        System.out.println();
        System.out.println("(1)Beginner - Guess between 1 and 10.");
        System.out.println("(2)Intermediate - Guess between 1 and 100.");
        System.out.println("(3)Advanced - Guess between 1 and 1000.");
        System.out.println("(4)Expert - Guess between 1 and 10000.");

        String gameLevel = myScanner.nextLine();

        int theNumber = numGenerate(gameLevel);
        int numTries = 0;

        ArrayList<Integer> userGuesses = new ArrayList<Integer>();

        boolean gameStatus = true;

        System.out.println("Guess a number! (Whole numbers)");

        while(gameStatus)
        {
            String guessString = myScanner.nextLine();
            int guessNum = Integer.parseInt(guessString);
            numTries++;

            if (theNumber == guessNum) {
                System.out.println("You guessed the correct number!" + " It took you " + numTries + " tries!");
                System.out.println("Play Again? (YES/NO) *case sensitive");
                String userPlayAgain = myScanner.nextLine();
                userGuesses.add(numTries);

                if(userPlayAgain.equals("YES"))
                {
                    System.out.println("Here we go again!");
                    theNumber = numGenerate(gameLevel);
                    numTries = 0;
                }
                else {
                    gameStatus = false;
                    System.out.println("Results of your games: " + userGuesses);
                }

            } else {
                if (guessNum > theNumber) {
                    System.out.println("Too high! Guess again.");
                }
                if (guessNum < theNumber) {
                    System.out.println("Too low! Guess again.");
                }
            }
        }


    }
    public static int numGenerate(String gameLevel)
    {
        System.out.println("You have chosen level " + gameLevel + "!");
        int rndNum = 0;
        //math.random()*math.pow(10,gameLevel)+1
        if (gameLevel.equals("1")) {
            rndNum = (int)(Math.random() * 10 + 1);
        }
        if (gameLevel.equals("2")) {
            rndNum = (int)(Math.random() * 100 + 1);
        }
        if (gameLevel.equals("3")) {
            rndNum = (int)(Math.random() * 1000 + 1);
        }
        if (gameLevel.equals("4")) {
            rndNum = (int)(Math.random() * 10000 + 1);
        }
        return rndNum;
    }
}
