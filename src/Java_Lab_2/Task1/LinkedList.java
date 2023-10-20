package Java_Lab_2.Task1;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int index;

    public Node<T> getHead() {
        return head;
    }


    @Override
    public void add(final T value) {
        final Node<T> node = new Node<>(value);

        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> lastNode = findLastNode(this.head);
            lastNode.setNext(node);
        }

    }

    private Node<T> findLastNode(Node<T> head) {
        if (head.getNext() == null) {
            return head;
        }
        return findLastNode(head.getNext());
    }

    @Override
    public T get(int index) {
        Node<T> pointer = this.head;
        Node<T> errorContainer = new Node("Error");

        if (index > size() - 1) {
            return errorContainer.getValue();
        }
        for (int i = 0; i < index; i++) {
            pointer = pointer.getNext();
        }
        return pointer.getValue();
    }

    @Override
    public void delete(T value) {
        Node<T> pointer = this.head;
        if(pointer.getValue() == value) {
            this.head = pointer.getNext();
        } else {
            while (pointer.getNext().getValue() != value) {
                pointer = pointer.getNext();
            }
            pointer.setNext(pointer.getNext().getNext());
        }
    }

    @Override
    public int size() {
        int size = 0;

        Node<T> pointer = this.head;

        while (pointer != null) {
            size++;
            pointer = pointer.getNext();
        }
        return size;
    }

    @Override
    public void print() {
        recursivePrint(this.head);
    }
    @Override
    public void clear() {
        this.head = null;
    }

    public void recursivePrint(Node<T> head) {

        if (head == null) {
            return;
        }

        System.out.println(head.getValue());

        if (head.getNext() == null) {
            return;
        }
        recursivePrint(head.getNext());
    }
}
