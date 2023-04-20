public class Circe implements Shape{


    private static final double pi = 3.14;

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (pi * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * pi * radius);
    }

    @Override
    public String toString() {
        return "Circe{" +
                "radius=" + radius +
                '}';
    }
}


