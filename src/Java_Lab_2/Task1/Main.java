package Java_Lab_2.Task1;

public class Main {
    public static void main(String[] args) {

        List list = new LinkedList<>();
        list.add(1);
        list.add("nine");
        list.add(6);
        list.add('a');

        System.out.println("Our default list: \n");
        list.print();

        System.out.println("\nList size is: ");
        System.out.println(list.size());

        System.out.println("\nThe element with the index 2: ");
        System.out.println(list.get(1));
        System.out.println("\nThe element with the index 10, that not exist: ");
        System.out.println(list.get(10));
        System.out.println();

        list.delete(1);
        System.out.println("List, after deleting the element with the index 1: ");
        list.print();

        System.out.println("Clearing list: \n");
        list.clear();
        list.print();

        System.out.println("That's all!");
    }
}
