package pl.mateusz.siedlecki.programowanie1.colletions.StackAndQueue;

public class Stack<T> implements StackQueue<T> {
    private Node<T> first;

    @Override
    public void push(T obj) {
        if(first==null){
            first = new Node<T>(obj);
        }else{
            first = new Node<T>(obj,first);
        }
    }

    @Override
    public T pop() {
        return (T) (first = first.getNext());
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
