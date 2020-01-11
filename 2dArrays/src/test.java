import java.util.Arrays;

public class test
{
    public static void main(String args[])
    {
        int total = 0;
        int[][] matrix = new int[5][4];

        matrix[0][1] = 1; matrix[0][2] = 3; matrix[0][3] = 10; matrix[1][0] = 22; matrix[2][3] = 4; matrix[3][2] = 9;         matrix[3][3] = 12; matrix[4][0] = 2; matrix[4][3] = 99; matrix[4][1] = 1;

/*        for(int r = 0; r < matrix.length; r++)
            for(int c = 0; c < matrix[0].length; c++)
                total+= matrix[r][c];
*/

        for(int[] row : matrix)
            for(int num : row)
                total += num;

      //  System.out.println(total);


/*        System.out.println(Arrays.toString(rowTotals(matrix)));
        System.out.println(Arrays.toString(colTotals(matrix)));
        System.out.println(getRowTotal(0,matrix));
*/
        //.length is the num of rows
        System.out.println(Arrays.deepToString(matrix));
        scrollLeft(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static int[] rowTotals(int[][] mat) //return total of each row
    {
        int[] summary = new int[mat.length];

        for(int r = 0; r < mat.length; r++)
            for(int c = 0; c < mat[r].length; c++)
                summary[r]+= mat[r][c];

        return summary;
    }

    public static int[] colTotals(int[][] mat)
    {
        int[] summary = new int[mat[0].length];

        for(int c = 0; c < mat[0].length; c++)
            for(int r = 0; r < mat.length; r++)
                summary[c] += mat[r][c];

        return summary;
    }

    public static int getRowTotal(int rowIndex, int[][] mat)
    {
        int total = 0;

        for(int c = 0; c < mat[rowIndex].length; c++)
            total += mat[rowIndex][c];

        /*for(int num : mat[rowIndex])

        total += num;
         */
        return total;
    }

    public static void scrollLeft(int[][] mat)
    {
        for(int i = 0; i < mat.length; i++)
        {
            int temp = mat[i][0];
            for(int j = 1; j < mat[0].length; j++)
            {
                mat[i][j - 1] = mat[i][j];
            }
            mat[i][mat[0].length-1] = temp;
        }


    }
}
