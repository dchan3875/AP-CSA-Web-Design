import java.util.Arrays;

public class test
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][4];
        arr[0][0] = 3; arr[0][1] = 2; arr[0][2] = 5; arr[0][3] = 2;
        arr[1][0] = 7; arr[1][1] = 9; arr[1][2] = 2; arr[1][3] = 5;
        arr[2][0] = 5; arr[2][1] = 4; arr[2][2] = 6; arr[2][3] = 8;

        /*
            3   2   5   2
            7   9   2   5
            5   4   6   8
         */
        /*
            2   5   2   3
            9   2   5   7
            4   6   8   5


         */
       // ArrayPractice.shiftLeft(arr);
       // System.out.print(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(ArrayPractice.transpose(arr)));


    }



}
