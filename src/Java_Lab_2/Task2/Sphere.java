package Java_Lab_2.Task2;

public class Sphere implements ShapeVolume {
    private double sphereRadius;


    public double getSphereRadius() {
        return sphereRadius;
    }

    public void setSphereRadius(double sphereRadius) {
        this.sphereRadius = sphereRadius;
    }

    public Sphere(double ... args) {
        this.sphereRadius = args[0];
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(this.sphereRadius, 2);
    }

    @Override
    public double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(this.sphereRadius, 3);
    }

    @Override
    public void print() {
        System.out.println(Sphere.this);
    }

    @Override
    public String toString() {
        return "Sphere \n" +
                "\nsphereRadius = " + sphereRadius +
                "\narea is = " + calculateArea() +
                "\nvolume is = " + calculateVolume()+
                "\n";
    }
}
