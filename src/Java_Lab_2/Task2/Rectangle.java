package Java_Lab_2.Task2;

public class Rectangle implements ShapeArea{
    final private double sideA;
    final private double sideB;


    public Rectangle(double ... args) {
        this.sideA = args[0];
        this.sideB = args[1];
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public void print() {
        System.out.println(Rectangle.this);
    }

    @Override
    public String toString() {
        return "Rectangle \n" +
                "\nsideA = " + sideA +
                "\nsideB = " + sideB +
                "\narea is = " + calculateArea()+
                "\n";
    }
}
