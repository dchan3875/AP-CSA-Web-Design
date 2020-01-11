import java.util.List;
import java.util.ArrayList;
//import java.util.*;
public class LongestRun
{
    public static void main(String[] args)
    {
        NumberCube myCube = new NumberCube();
        int[] arr = getCubeTosses(myCube,8);
    //    List<Integer> runList = new ArrayList<Integer>();

   /*     for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        */
        int[] testingArr = {1,4,5,5};
        for (int i = 0; i < testingArr.length; i++)
        {
            System.out.print(testingArr[i]+ ",");
        }

  /*     for (int g = 4; g < testingArr.length; g++)
        {
            if (testingArr[g] == testingArr[g-1])
            {
                System.out.println("!");

            }
            else
            {
                System.out.println("?");
            }
        }
        */

    }


    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] tossValues = new int[numTosses];

        for (int i = 0; i < tossValues.length; i++) {
            tossValues[i] = cube.toss();
        }
        return tossValues;
    }
  /* public static int getLongestRun(int[] values)
    {
        int longestRunLen = 1;
        int startOfLongestRun = 0;

        int currentRunLen = 1;
        int startOfCurrentRun = 0;

        for (int i = 1; i < values.length; i++)  //compares element outside of index, so entire if else doesnt occur
        {
            if(values[i] == values[i - 1])
            {
                currentRunLen++;
            }
            else  //only occurs if run ends
            {
                if(currentRunLen > longestRunLen)
                {
                    longestRunLen = currentRunLen;
                    startOfLongestRun = startOfCurrentRun;

                }
                startOfCurrentRun = i;
                currentRunLen = 1;
            }
        }
        if(currentRunLen > longestRunLen)
        {
            longestRunLen = currentRunLen;
            startOfLongestRun = startOfCurrentRun;
        }

        if(longestRunLen == 1)
        {
            return -1;
        }
        return startOfLongestRun;
    }
    */
        public static List<Integer> getStartingIndexesOfRuns(int[] values, int targetLength)
        {
            List<Integer> startIndexes = new ArrayList<Integer>();
            int currentRunLen = 1;
            int i;

            for (i = 1; i < values.length; i++)
            {
                if(values[i] == values[i - 1])
                {
                    currentRunLen++;
                    if(i == values.length - 1 && currentRunLen == targetLength)
                    {
                        startIndexes.add(new Integer(i - targetLength + 1))
                    }
                }
                if (values[i] == values[i - 1])
                {
                    currentRunLen++;
                }
                else
                {
                    if (currentRunLen == targetLength)
                    {
                        startIndexes.add(new Integer(i-targetLength));  //i - targlength = start of run
                    }
                    currentRunLen = 1;
                }
            }
            return startIndexes;
        }
}