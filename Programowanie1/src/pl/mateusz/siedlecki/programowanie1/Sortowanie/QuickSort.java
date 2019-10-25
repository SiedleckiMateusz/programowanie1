package pl.mateusz.siedlecki.programowanie1.Sortowanie;

public class QuickSort<T extends Comparable<T>> implements Sort<T>{
    public T[] tab;
    public int j;


    public QuickSort(){ }

    public void quickSort(T[] tab, int indexBegin, int indexEnd){
        T pivot = tab[indexEnd];
        j = indexBegin;
        for (int i = indexBegin; i<indexEnd; i++){
            if (tab[i].compareTo(pivot)<0){
                swap(tab, i, j);
                j++;
            }
        }
        tab[indexEnd] = tab[j];
        tab[j] = pivot;

        if (indexBegin<j-1){
            quickSort(tab, indexBegin, j-1);
        }
        if(j+1<indexEnd){
            quickSort(tab, j+1,indexEnd);
        }
    }


    public void swap(T[] tab, int index1, int index2){
        T buffor = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = buffor;
    }

    @Override
    public void sort(T[] tab) {
        quickSort(tab, 0, tab.length-1);
    }
}
