package Java_Lab_2.Task1;

public class Main {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(1);
        list.add(9);
        list.add(6);
        list.add(7);

        list.print();

        System.out.println();
        System.out.println();
        list.delete(6);

        list.print();

    }
}
