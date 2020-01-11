import java.util.Arrays;

public class test
{
    public static void main(String[] args)
    {
        double[][] matrix = new double[4][4];
        matrix[0][0] = 99; matrix[0][1] = 1; matrix[0][2] = 3; matrix[0][3] = 10; matrix[1][0] = 4; matrix[1][1] = 3; matrix[1][2] = 9;         matrix[1][3] = 12; matrix[2][0] = 99; matrix[2][1] = 1; matrix[2][2] = 8; matrix[2][3] = 11; matrix[3][0] = 3; matrix[3][1] = 8; matrix[3][2] = 9; matrix[3][3] = 62;

        System.out.println("MAJOR : " + sumMajorDiagonal(matrix));
        System.out.println("MINOR : " + sumMinorDiagonal(matrix));
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(transpose(matrix)));
        System.out.println(isMatrix(matrix));
        // 99   1    3   10
        //  4   3    9   12
        // 99   1    8   11
        //  3   8    9   62
    }
        // 0,3  1,2  2,1 3,0
    public static double sumMajorDiagonal(double[][] matrix)
    {
        if(matrix.length != matrix[0].length)
            return Integer.MIN_VALUE;

        double total = 0.0;

        for(int r = 0; r < matrix.length; r++)
                total += matrix[r][r];

        return total;
    }

    public static double sumMinorDiagonal(double[][] matrix)
    {
        if(matrix.length != matrix[0].length)
            return Integer.MIN_VALUE;

        double total = 0.0;
        int r = 0;

        for (int c = matrix.length - 1; c >= 0; c--)
        {
            total += matrix[r][c];
            r++;
        }

        //matrix[i][matrix[0].length-1-i]
        return total;
    }

    public static double[][] transpose(double[][] matrix)
    {
        double[][] newMat = new double[matrix[0].length][matrix.length];

        for(int r = 0; r < matrix.length; r++)
            for (int c = 0; c < matrix[r].length; c++)
                newMat[c][r] = matrix[r][c];

        return newMat;


        // 0,0  > 0,0     0,1 > 2,0    0,2 > 2,0    0,3 > 3,0

        //  4   3    9   12
        // 99   1    8   11
        //  3   8    9   62

        // 4   99   3
        // 3    1   8
        // 9    8   9
        // 12  11   62

    }
    public static boolean isMatrix(double[][] matrix)
    {
        int rowSize = matrix[0].length;

        for(int i = 1; i < matrix.length; i++)
            if(matrix[i].length != rowSize)
                return false;

        return true;
    }
}
