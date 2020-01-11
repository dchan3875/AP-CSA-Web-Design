import java.util.*; //makes all util available

public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[lowPosition])
                {
                    lowPosition = j;
                }
            }
            //swap(i,lowPosition,arr);
            int temp = arr[i];
            arr[i] = arr[lowPosition];
            arr[lowPosition] = temp;
            //printArr(arr);
        }
    }

    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
        /*
        int temp = arr[i];
        arr[i] = arr[lowPosition];
        arr[lowPosition] = temp;
        */
    }
    public static void printArr(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void ascendingSort(String[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j].compareTo(arr[lowPosition]) < 0) //negative num bc arr[j] precedes arr[lowpos]
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition,arr);                        //"anna" < "ann", ann goes first
        }
    }
    public static void ascendingSort(List<String> list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            int lowPosition = i;
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(j).compareTo(list.get(lowPosition)) < 0)
                {
                    lowPosition = j;
                }
            }
            swap(i,lowPosition, list);
        }
    }
    private static void swap(int indexA, int indexB, List<String> list)
    {
        list.set(indexA,list.set(indexB,list.get(indexA)));
    }
    private static void swap(int indexA, int indexB, String[] arr)
    {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    public static void removeLongerThan (int lengthMax , List<String> list)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i).length() > lengthMax)
                list.remove(i);
        }
    }
    public static void insertionSort(int[] elements)
    {
        for(int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while(possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static int getRandomNumber(int maxDigits)
    {
        return (int)(Math.random() * Math.pow(10,maxDigits));
    }

    public static int[] buildArray(int theLength)
    {
        int[] arr = new int[theLength];

        for(int i = 0; i < theLength; i++)
        {
            arr[i] = getRandomNumber(6);
        }
        return arr;
    }

    public static int[] copyArray(int[] arr)
    {
        int[] copied = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            copied[i] = arr[i];
        }
        return copied;
    }
    public static void printArr(String[] arr)
    {
        for(String name : arr)
        {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

//1 2 7 4 8


