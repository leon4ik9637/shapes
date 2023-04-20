import java.util.ArrayList;
import java.util.List;

public class TestShapes {
    public static void main(String[] args) {



        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circe circle = new Circe();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(square);

        rectangle.setWidth(5.5);
        rectangle.setHeight(6.0);
        square.setSide(2.5);
        circle.setRadius(4);

        double maxArea = Double.MIN_VALUE;
        Shape classMax = null;

        for (Shape shape : shapes) {
            String cn = shape.getClass().getSimpleName();
            System.out.println(shape + "\nArea of the " + cn + " is = " + shape.getArea()
                    + "\nPerimeter of the " + cn + " is = " + shape.getPerimeter() + "\n");

            if(shape.getArea() > maxArea) {
                maxArea = shape.getArea();
                classMax = shape;
            }
        }
        System.out.println(classMax.getClass().getSimpleName() + " has the largest area as " + maxArea);









    }
}
