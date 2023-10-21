package Java_Lab_2.Task2;

public class Cube implements ShapeVolume {
    private double cubeSide;

    public double getCubeSide() {
        return cubeSide;
    }

    public void setCubeSide(double cubeSide) {
        this.cubeSide = cubeSide;
    }

    public Cube(double ... args) {
        this.cubeSide = args[0];
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(this.cubeSide, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(this.cubeSide, 3);
    }

    @Override
    public void print() {
        System.out.println(Cube.this);
    }

    @Override
    public String toString() {
        return "Cube \n" +
                "\ncubeSide = " + cubeSide +
                "\narea is = " + calculateArea() +
                "\nvolume is = " + calculateVolume()+
                "\n";
    }
}
