package Java_Lab_2.Task1;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stack<T> implements StackAction<T> {
    private Node<T> head;


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.getValue();
                current = current.getNext();
                return value;
            }
        };
    }

  /*  @Override
    public void forEach(Consumer<? super T> action) {
        StackAction.super.forEach(action);
    }*/

/*    @Override
    public Spliterator<T> spliterator() {
        return StackAction.super.spliterator();
    }*/

    @Override
    public void push(final T value) {
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
    public T pop() {
        if (this.head == null) {
            System.out.println("Stack is empty!");
            return null;
        }

        Node<T> pointer = this.head;
        if (pointer.getNext() == null) {
            this.head = null;
        } else {
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
        }
        return pointer.getValue();
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
        printEachValue();
    }
    @Override
    public void clear() {
        this.head = null;
    }

    public void printEachValue() {
        for (T value : this) {
            System.out.println(value);
        }
    }
}
