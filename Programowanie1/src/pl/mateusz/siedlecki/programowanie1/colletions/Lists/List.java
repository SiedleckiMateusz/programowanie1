package pl.mateusz.siedlecki.programowanie1.colletions.Lists;


public interface List<T> {
    void add(T v);
    void addAsFirst(T v);
    void addAfter(T v,int index);
    boolean isEmpty();
    void remove(T v);
    void removeFirst();
    void removeLast();
    T getAt(int index);
    Object[] asArray();
}
