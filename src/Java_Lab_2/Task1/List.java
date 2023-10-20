package Java_Lab_2.Task1;

public interface List <T>{
    void add(T value);
    T get(int index);
    void delete(T value);
    void print();
    void clear();
    int size();
}
