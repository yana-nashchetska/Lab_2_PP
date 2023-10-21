package Java_Lab_2.Task2;

public class Square implements ShapeArea{
    private double squareSide;


    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    public Square(double ... args) {
        this.squareSide = args[0];
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.squareSide, 2);
    }

    @Override
    public void print() {
        System.out.println(Square.this);
    }

    @Override
    public String toString() {
        return "Square \n" +
                "\nsquareSide = " + squareSide +
                "\narea is = " + calculateArea()+
                "\n";
    }
}
