package pl.mateusz.siedlecki.programowanie1.colletions.StackAndQueue;

public class Queue<T> implements StackQueue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size = 0;


    @Override
    public void push(T value) {
        if (front == null && back == null) {
            back = new Node<T>(value);
            front = back;
        } else {
            Node<T> tNode = new Node<>(value);
            back.setNext(tNode);
            back = tNode;
        }
        size++;
    }

    @Override
    public T pop() {
        Node<T> tmp = front;
        front = front.getNext();
        if (front == null) {
            back = null;
        }
        size--;
        return tmp.getValue();

    }

    @Override
    public T peek() {
        if (front == null) {
            return null;
        }
        return front.getValue();
    }

    @Override
    public boolean isEmpty() {
        return front == null && back == null;
    }
}
