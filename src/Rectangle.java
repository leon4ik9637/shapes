



// implement Shape interface and provide abstract method implementation
public class Rectangle implements Shape{

    /*
    Define instance variable of rectangle as below
    Instance variable must be encapsulated
    double width
    double weight
     */

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a rectangle can be found as => width * height
    Perimeter => 2 * (width + height)
     */

    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }



    // override toString() method here


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
