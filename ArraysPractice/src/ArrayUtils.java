public class ArrayUtils
{
    public static boolean changeValue(int[] arr, int pos, int value)
    {
        if(pos > arr.length-1 || pos < 0)
            return false;
        arr[pos] = value;
        return true;
    }
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if(i != arr.length - 1) // if not at last element
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static int[] addElement(int[] arr, int value)
    {
        int[] temp = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = value;
       // arr = temp;   doesnt work b/c only changes locally
        return temp;

    }
}

