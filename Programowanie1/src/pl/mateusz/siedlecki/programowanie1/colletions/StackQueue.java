package pl.mateusz.siedlecki.programowanie1.colletions;

public interface StackQueue<T> {
    //dodanie elementu
    void push(T obj);
    // pobranie elementu
    T pop();
    //podejrzenie elementu
    T peek();
    //sprawdzenie czy stos jest pusty
    boolean isEmpty();
}
