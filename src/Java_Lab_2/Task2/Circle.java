package Java_Lab_2.Task2;

public class Circle implements ShapeArea{
    final private double radius;
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
