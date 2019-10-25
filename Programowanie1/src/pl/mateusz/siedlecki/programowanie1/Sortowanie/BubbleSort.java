package pl.mateusz.siedlecki.programowanie1.Sortowanie;

public class BubbleSort<T extends  Comparable<T>> implements Sort<T> {
    //metoda zamieniajaca pozycje w tabeli
    public void swap(int i, int i2, T tab[]){
        T temp;
        temp = tab[i];
        tab[i]=tab[i2];
        tab[i2]=temp;
    }
    @Override
    public void sort(T[] table) {
        for(int j= 0; j<table.length-1;j++){
            for (int i = 0; i<table.length-1;i++){
                if (table[i].compareTo(table[i+1])>0){
                    swap(i, i+1, table);
                }
            }
        }
    }
}
