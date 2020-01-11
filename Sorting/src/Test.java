import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        /*int[] arr1 = {328, 812, 1019, 519, 1011, 408, 406, 214, 1004, 222, 102, 816, 204, 601, 312, 713, 604};
        Sorts.printArr(arr1);
        System.out.println();

        Sorts.ascendingSort(arr1);

        Sorts.printArr(arr1);
        System.out.println();

        String[] names = {"Andrew","Xinyi", "Isaiah", "Qian", "Jamil", "Richard", "Christopher", "Nathanael", "Asllan", "Hai Jie", "Philip", "Andrew", "Kenny", "Alan", "Awais", "Ivan", "Chenxi"};
        List<String> namesList = new ArrayList<String>();
        for(String s : names)
        {
            namesList.add(s);
        }
        System.out.println(namesList);

        Sorts.removeLongerThan(5,namesList);
        System.out.println(namesList);

        Sorts.printArr(arr1);
        Sorts.ascendingSort(arr1);

        Sorts.insertionSort(arr1);
        Sorts.printArr(arr1);

        Sorts.ascendingSort(arr1);
        Sorts.printArr(names);
        System.out.println();

        Sorts.ascendingSort(names);

        Sorts.printArr(names);
        System.out.println();


        ArrayList<String> aL1 = new ArrayList<String>();
        aL1.add("D");
        aL1.add("A");
        aL1.add("C");
        aL1.add("V");
        aL1.add("b");
        aL1.add("B");
        aL1.add("A");
        aL1.add("Z");
        Sorts.ascendingSort(aL1);
        System.out.println(aL1);




        */
        int[] benchOne = Sorts.buildArray(100000);
        //int[] benchTwo = Sorts.buildArray(100000);
        //int[] benchTwo = benchOne.clone();
        int[] benchTwo = Sorts.copyArray(benchOne);
        //SELECTION SORT
        long start1 = System.currentTimeMillis();
        Sorts.ascendingSort(benchOne);
        long end1 = System.currentTimeMillis();
        System.out.println("SELECTION SORT ON UNSORTED: " + (end1 - start1));

        long start1b = System.currentTimeMillis();
        Sorts.ascendingSort(benchOne);
        long end1b = System.currentTimeMillis();
        System.out.println("SELECTION SORT ON SORTED: " + (end1b - start1b));

        System.out.println();

        //INSERTION SORT
        long start2 = System.currentTimeMillis();
        Sorts.insertionSort(benchTwo);
        long end2 = System.currentTimeMillis();
        System.out.println("INSERTION SORT ON UNSORTED: " + (end2 - start2));

        long start2b = System.currentTimeMillis();
        Sorts.insertionSort(benchTwo);
        long end2b = System.currentTimeMillis();
        System.out.println("INSERTION SORT ON SORTED: " + (end2b - start2b));





    }
}
