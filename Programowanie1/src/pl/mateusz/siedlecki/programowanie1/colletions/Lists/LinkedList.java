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

        for (Object integer : lista){
            System.out.print(integer+", ");
        }
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
        if (index<size){
            Node<T> tNode = new Node<>(v);
            Node<T> nodeBeforeTNode = findByIndex(index);

            tNode.setPrevious(nodeBeforeTNode);
            tNode.setNext(nodeBeforeTNode.getNext());

            nodeBeforeTNode.getNext().setPrevious(tNode);
            nodeBeforeTNode.setNext(tNode);

            size++;

        }else{
            add(v);
        }


    }

    public Node<T> findByIndex(int index){
        int i = 0;
        Node<T> buffor = null;
        for (Node<T> a = first; i<index ;a = a.getNext()){
            buffor=a;
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
    public void remove(T v) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public T getAt(int index) {
        return null;
    }

    @Override
    public Object[] asArray() {
        if (first == null) {
            return new Object[0];
        }
        Object[] tab = new Object[size];
        int i = 0;
        for (Node<T> x = first; x !=null; x = x.getNext()){
            tab[i++] = x.getValue();
        }
        return tab;
    }
}
