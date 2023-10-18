package Java_Lab_2.Task1;

import java.util.Iterator;

public class LinkedList<T> implements List, Iterable<Node> {
    private Node head;

    @Override
    public void add(final int value) {
        final Node node = new Node(value);

        if (this.head == null) {
            this.head = node;

        } else {
            Node lastNode = findLastNode(this.head);
            lastNode.setNext(node);
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkedListIterator(this.head);
    }

    @Override
    public int get(int index) {
        if (index > size() - 1) {
            return -3;
        }

        int currentIndex = 0;
        for (Node node : this) {
            if (currentIndex == index) {
                return node.getValue();
            }
            currentIndex++;
        }

        return -1;
    }

    @Override
    public void print() {
        if (this.head == null) {
            return;
        }
        printRecursive(this.head);
    }

    @Override
    public int size() {
        int size = 0;

        Node pointer = this.head;
        while (pointer != null) {
            size++;
            pointer = pointer.getNext();
        }
        return size;
    }

    @Override
    public void delete(int value) {

        Node pointer = this.head;
        for (Node node : this) {
            if (value == node.getValue()) {
                this.head = this.head.getNext();
            }
            if (pointer.getNext().getValue() == value) {
                pointer.setNext(pointer.getNext().getNext());
                return;
            }
            pointer = pointer.getNext();
        }
    }

    private void printRecursive(Node head) {

        if (head == null) {
            return;
        }

        System.out.println(head.getValue());

        if (head.getNext() == null) {
            return;
        }
        printRecursive(head.getNext());
    }

    private Node findLastNode(Node head) {
        if (head.getNext() == null) {
            return head;
        } else {
            return findLastNode(head.getNext());
        }
    }

}
