package Java_Lab_2.Task1;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<Node> {
    private Node head;

    public LinkedListIterator(Node head) {
        this.head = head;
    }

    public boolean hasNext() {
        return this.head != null;
    }

    public Node next() {
        Node current = this.head;
        this.head = this.head.getNext();
        return current;
    }
}
