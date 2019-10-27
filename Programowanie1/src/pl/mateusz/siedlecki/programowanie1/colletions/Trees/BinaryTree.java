package pl.mateusz.siedlecki.programowanie1.colletions.Trees;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {
    Node<T> root;
    int size =0;

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(8);
        tree.add(9);

        tree.print();

    }

    @Override
    public void add(T v) {
        if(root==null){
            root = new Node<T>(v);
        }else{
            Optional<Node<T>> maybe = findParent(v,root);
            if (!maybe.isPresent() || maybe.get().getValue()==v){
                return;
            }
            Node<T> parent = maybe.get();
            if (parent.getValue().compareTo(v)>0){
                parent.setLeft(new Node<>(v));
            }else{
                parent.setRight(new Node<>(v));
            }
        }
        size++;
    }

    private Optional<Node<T>> findParent(T v, Node<T> tNode){

        if(tNode.getValue().compareTo(v) > 0){
            if(tNode.getLeft()==null){
                return Optional.of(tNode);
            }else{
                return findParent(v,tNode.getLeft());
            }
        }

        if (tNode.getValue().compareTo(v)<0){
            if(tNode.getRight()==null){
                return Optional.of(tNode);
            }else{
                return findParent(v,tNode.getRight());
            }
        }
       return Optional.empty();
    }

    @Override
    public void remove(T v) {

    }

    @Override
    public int numberOfElements() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    public void print(){
        System.out.println(Arrays.toString(asArray()));
    }

    private void inOrder(Node<T> node, Object[] values, AtomicInteger index) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft(), values, index);
        values[index.getAndIncrement()] = node.getValue();
        inOrder(node.getRight(), values, index);
    }

    public Object[] asArray(){
        Object[] values = new Object[size];
        inOrder(root, values, new AtomicInteger(0));
        return values;
    }
}
