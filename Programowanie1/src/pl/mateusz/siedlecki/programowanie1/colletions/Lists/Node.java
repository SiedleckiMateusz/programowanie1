package pl.mateusz.siedlecki.programowanie1.colletions.Lists;

import java.util.Objects;

public class Node<T> {
    private Node<T> next;
    private Node<T> previous;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> last) {
        this.previous = last;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node){
            Node<T> toCompare = (Node<T>) obj;
            return Objects.equals(toCompare.value, this.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
