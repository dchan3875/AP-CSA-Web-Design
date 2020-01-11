public class ArrayPractice
{
    public static void shiftLeft(int[][] arr2D) //shift columns
    {
        for(int c = 0; c < arr2D[0].length - 1; c++)
        {
            for(int r = 0; r < arr2D.length; r++)
            {
                int temp = arr2D[r][c];
                if(c == 0)
                {
                    arr2D[r][c] = arr2D[r][arr2D[0].length-1];
                    arr2D[r][arr2D[0].length-1] = temp;
                }
                else
                {
                    arr2D[r][c] = arr2D[r][c - 1];
                    arr2D[r][c - 1] = temp;
                }
            }
        }
    }

    /*
        int[] col0 = new int[arr2D.length];
        for(int r =0; r < arr2D.length; r++)
            col0[r] = arr2D[r][0];

        for(int r = 0; r < arr2D.length; r++)
            for(int c = 1; c < arr2D[0].length; c++)
                arr2D[r][c-1] = arr2D[r][c];

        for(int r =0; r < arr2D.length; r++)
            arr2D[r][arr2D[0].length-1] = col0[r];
     */
    public static int[][] transpose(int[][] arr2D)  //swap rows and columns
    {
        int[][] transposed = new int[arr2D[0].length][arr2D.length];
        for(int r = 0; r < arr2D.length; r++)
        {
            for(int c = 0; c < arr2D[0].length; c++)
            {
              transposed[c][r] = arr2D[r][c];
            }
        }
        return transposed;
    }
    /*
            3   2   5   2
            7   9   2   5
            5   4   6   8

            3   7   5
            2   9   4
            5   2   6
            2   5   8
     */
}
