package pl.mateusz.siedlecki.programowanie1.colletions.Lists;

public class LinkedList<T> implements List<T> {
    Node<T> first;
    Node<T> last;
    private int size = 0;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(42);
        list.add(1);
        list.add(43);
        list.addAsFirst(99);
        list.addAfter(200, 4);
        Object[] lista = list.asArray();

        for (Object integer : lista) {
            System.out.print(integer + ", ");
        }
        list.remove(6);

        System.out.println();
        lista = list.asArray();
        for (Object integer : lista) {
            System.out.print(integer + ", ");
        }

        System.out.println();
        System.out.println(list.getAt(5));
    }


    @Override
    public void add(T v) {
        if (isEmpty()) {
            first = new Node<>(v);
            last = first;
        } else {
            Node<T> tNode = new Node<>(v);
            last.setNext(tNode);
            tNode.setPrevious(last);
            last = tNode;
        }
        size++;
    }

    @Override
    public void addAsFirst(T v) {
        if (isEmpty()) {
            add(v);
        } else {
            Node<T> tnode = new Node<>(v);
            first.setPrevious(tnode);
            tnode.setNext(first);
            first = tnode;
            size++;
        }
    }

    @Override
    public void addAfter(T v, int index) {
        if (index < size) {
            Node<T> tNode = new Node<>(v);
            Node<T> nodeBeforeTNode = findByIndex(index);

            tNode.setPrevious(nodeBeforeTNode);
            tNode.setNext(nodeBeforeTNode.getNext());

            nodeBeforeTNode.getNext().setPrevious(tNode);
            nodeBeforeTNode.setNext(tNode);

            size++;

        } else {
            add(v);
        }


    }

    private Node<T> findByIndex(int index) {
        int i = 0;
        Node<T> buffor = null;
        for (Node<T> a = first; i < index; a = a.getNext()) {
            buffor = a;
            i++;
        }

        return buffor;
    }

    @Override
    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(int index) {
        if (index == 1 && size == 1) {
            first = null;
            last = null;
            size--;
        } else if (index == 1 && size > 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else if (index < size) {
            Node<T> nodeToRemove = findByIndex(index);

            nodeToRemove.getPrevious().setNext(nodeToRemove.getNext());
            nodeToRemove.getNext().setPrevious(nodeToRemove.getPrevious());
            size--;
        }
    }

    @Override
    public void removeFirst() {
        if(size>1){
            first = first.getNext();
            first.setPrevious(null);
            size--;
        }else{
            first = null;
            last = null;
            size--;
        }

    }

    @Override
    public void removeLast() {
        if(size>1){
            last = last.getPrevious();
            last.setNext(null);
            size--;
        }else{
            first = null;
            last = null;
            size--;
        }

    }

    @Override
    public T getAt(int index) {
        if(index<=size){
            return findByIndex(index).getValue();
        }
        return null;
    }

    @Override
    public Object[] asArray() {
        if (first == null) {
            return new Object[0];
        }
        Object[] tab = new Object[size];
        int i = 0;
        for (Node<T> x = first; x != null; x = x.getNext()) {
            tab[i++] = x.getValue();
        }
        return tab;
    }
}
