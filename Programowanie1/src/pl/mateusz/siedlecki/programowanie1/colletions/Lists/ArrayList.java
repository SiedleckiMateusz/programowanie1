package pl.mateusz.siedlecki.programowanie1.colletions.Lists;

import java.lang.annotation.Target;
import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    public static final int SIZE = 10;
    private Object[] tab;
    int size = 0;


    public ArrayList(){
        tab = new Object[SIZE];
    }

    ArrayList(int size){
        tab = new Object[size];
    }


    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(5);
        tab.add(10);
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);
        tab.add(5);
        tab.add(6);
        tab.add(7);
        tab.addAsFirst(99);
       tab.addAfter(55,5);

        for (Object element : tab.asArray()){
            System.out.print(element+", ");
        }

        System.out.println();

       tab.remove(2);
        for (Object element : tab.asArray()){
            System.out.print(element+", ");
        }
    }


    @Override
    public void add(T v) {
        checkSizeYourTab();
        tab[size++] = v;
    }

    private void checkSizeYourTab(){
        if (size>=tab.length){
            tab = Arrays.copyOf(tab,tab.length+SIZE);
        }
    }

    @Override
    public void addAsFirst(T v) {
        checkSizeYourTab();
        System.arraycopy(tab,0,tab,1,size);
        tab[0] = v;
        size++;
    }

    @Override
    public void addAfter(T v, int index) {
        checkSizeYourTab();
        System.arraycopy(tab,index,tab,index+1,size-index);
        tab[index] = v;
        size++;
    }

    @Override
    public boolean isEmpty() {
        if (size>0){
            return false;
        }
        return true;
    }

    @Override
    public void remove(int index) {
        System.arraycopy(tab,index,tab,index-1,size-index);
        size--;
    }

    @Override
    public void removeFirst() {
        System.arraycopy(tab,1,tab,0,size);
        size--;
    }

    @Override
    public void removeLast() {
        tab[size-1] = null;
        size--;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T getAt(int index) {
        return (T) tab[index];
    }

    @Override
    public Object[] asArray() {
        return Arrays.copyOf(tab,size);
    }

}
