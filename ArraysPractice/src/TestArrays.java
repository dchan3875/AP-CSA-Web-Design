public class TestArrays
{
    public static void main(String[] args)
    {
        int[] myArray = {2,7,9,1,-3,53,11,2};
        /*  //myArray[4] = 849;
      ArrayUtils.changeValue(myArray, 4, 849); //myarray passing memory address b/c it is an object,
        System.out.println(myArray);                        //passing primitive gives value, printing it gives mem addrs in hex
        System.out.println("myArray[4] = " + myArray[4]);
        ArrayUtils.changeValue(myArray, 9, -2);
        ArrayUtils.printArray(myArray);
   */

        myArray = ArrayUtils.addElement(myArray,7);
        ArrayUtils.printArray(myArray);
    }
}

