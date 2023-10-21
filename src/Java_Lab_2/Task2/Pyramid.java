package Java_Lab_2.Task2;

public class Pyramid implements ShapeVolume{
    private double pyramidSide;
    private double pyramidHeight;

     private double innerRadius;

    public double getPyramidSide() {
        return pyramidSide;
    }

    public void setPyramidSide(double pyramidSide) {
        this.pyramidSide = pyramidSide;
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }


    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public Pyramid(double ... args) {
        this.pyramidSide = args[0];
        this.pyramidHeight = args[1];
        this.innerRadius = args[2];
    }

    public double findApothem(){
        return Math.sqrt(Math.pow(this.pyramidHeight, 2)) + Math.pow(this.innerRadius, 2);
    }

    public double findPerimeter() {
        return this.pyramidSide * 4;
    }
    @Override
    public double calculateArea() {
        return 0.5 * findPerimeter() * findApothem() + Math.pow(pyramidSide, 2);
    }

    @Override
    public double calculateVolume() {
        return 1.0/3.0 * Math.pow(pyramidSide, 2) * this.pyramidHeight;
    }

    @Override
    public void print() {
        System.out.println(Pyramid.this);
    }

    @Override
    public String toString() {
        return "Pyramid \n" +
                "\npyramidSide = " + pyramidSide +
                "\npyramidHeight = " + pyramidHeight +
                "\ninnerRadius = " + innerRadius +
                "\narea is = " + calculateArea() +
                "\nvolume is = " + calculateVolume()+
                "\n";
    }
}
