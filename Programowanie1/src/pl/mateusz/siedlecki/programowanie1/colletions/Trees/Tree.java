package pl.mateusz.siedlecki.programowanie1.colletions.Trees;

public interface Tree<T> {

    void add(T v);
    void remove(T v);
    int numberOfElements();
    boolean isEmpty();

}
