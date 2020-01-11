import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        Coords myCoord = new Coords(2,3);
        Coords myCoord2 = new Coords(5,-6);
        Coords myCoord3 = new Coords(-5,-8);
        Coords myCoord4 = new Coords(-10,2);
        /*

        System.out.println(myCoord.getX());
        System.out.println(myCoord.getY());
        myCoord.reflectOnXAxis();
        System.out.println(myCoord);

        LinearEquation Line1 = new LinearEquation(3,4,5);
        LinearEquation Line2 = new LinearEquation(6,-2,-1);

        LinearEquation Line3 = new LinearEquation(1,3,5);
        LinearEquation Line4 = new LinearEquation(1,3,5);
        System.out.println(Line1.pointOfIntersection(Line2));
        System.out.println(Line3.pointOfIntersection(Line4));
        System.out.println(Line1.getSlopeInterceptForm());


        ComplexNumber test1 = new ComplexNumber(4,8); // a    b
        ComplexNumber test2 = new ComplexNumber(9,2); // c    d

        ComplexNumber test3 = new ComplexNumber( 6,18);
        ComplexNumber test4 = new ComplexNumber(2,3);
        System.out.println(test1);
        System.out.println(test1.getRealMagnitude());
        System.out.println(test1.getImaginaryMagnitude());
        test1.multiply(test2);
        System.out.println(test1);

        test3.divideBy(test4);
        System.out.println(test3);
        */
        ArrayList<Coords> testList = new ArrayList<>();
        testList.add(myCoord);
        testList.add(myCoord2);
        testList.add(myCoord3);
        testList.add(myCoord4);
        //testList.add(new Coords(0,0));
        testList.add(new Coords(-13,2));
        testList.add(new Coords(2,2));
        testList.add(new Coords(1,3));
        testList.add(new Coords(-7,4));

      /*  System.out.println(Coords.getPointClosestToOrigin(testList));
        // static allows to run without being off coord obj, but do need class

        System.out.println(myCoord.compareTo(myCoord2));
        System.out.println(myCoord3.compareTo(myCoord4));
        System.out.println(myCoord.compareTo(myCoord4));
*/
        Coords[] testSort = {new Coords(3,5),new Coords(7,5), new Coords(-3,6), new Coords(0,0), new Coords(-1, -1), new Coords(10,-5), new Coords(30,50), new Coords(-3,-1)};
        Coords.printArr(testSort);
        System.out.println();

        Coords.sortCoords(testSort);
        Coords.printArr(testSort);
        System.out.println();

        Coords.sortCoordsByDistanceFromOrigin(testSort);
        Coords.printArr(testSort);
        System.out.println();
    }
}
