import java.util.List;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        Shape myCircle = new Circle(5, "Test Circle");
        System.out.println(myCircle);

        Shape myTriangle = new Triangle(6,7,10,"Test Triangle");
        System.out.println(myTriangle);

        Shape myRectangle = new Rectangle(5, 4, "Test Rectangle");
        System.out.println(myRectangle);

        Shape myRectangle2 = new Rectangle(10, 2, "Test Rectangle2");
        System.out.println(myRectangle2);

        Shape myRectangle3 = new Rectangle(3,"Test Rectangle3");
        System.out.println(myRectangle3);

        System.out.println();

        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(myCircle);
        shapeList.add(myTriangle);
        shapeList.add(myRectangle);
        shapeList.add(myRectangle2);
        shapeList.add(myRectangle3);

        Shape.sortByAreaPerimeter(shapeList);

        for(Shape s : shapeList)
        {
            System.out.println(s);
        }



    }
}
