package Java_Lab_2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       ShapeFactory factory = new ShapeFactory();

        factory.createShape("triangle", 3, 5, 4);
        factory.createShape("square", 4);
        factory.createShape("rectangle", 15, 3);
        factory.createShape("cube", 3.4);
        factory.createShape("pyramid", 12, 2, 2);
        factory.createShape("circle", 13.3);
        factory.createShape("sphere", 55);

    }
}
