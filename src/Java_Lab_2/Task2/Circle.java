package Java_Lab_2.Task2;

public class Circle implements ShapeArea{
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double ... args) {
        this.radius = args[0];
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void print() {
        System.out.println(Circle.this);
    }

    @Override
    public String toString() {
        return "Circle \n" +
                "\nradius = " + radius +
                "\narea is = " + calculateArea() +
                "\n";
    }
}
