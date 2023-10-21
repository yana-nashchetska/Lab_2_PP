package Java_Lab_2.Task2;

public class Rectangle implements ShapeArea{
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

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
