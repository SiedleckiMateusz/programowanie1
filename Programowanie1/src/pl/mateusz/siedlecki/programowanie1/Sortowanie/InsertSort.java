package pl.mateusz.siedlecki.programowanie1.Sortowanie;

public class InsertSort<T extends Comparable<T>> implements Sort<T> {

    public void sort(int[] table){
        int x;
        int i;
        for (int j = table.length-1; j>=0; j--){
            x=table[j];
            i=j+1;
            while (i<=(table.length-1) && x>table[i]){
                table[i-1]=table[i];
                i++;
            }table[i-1]=x;
        }
    }

    @Override
    public void sort(T[] tab) {
        T x;
        int i;
        for (int j = tab.length-1; j>=0; j--){
            x=tab[j];
            i=j+1;
            while (i<=(tab.length-1) && x.compareTo(tab[i])>0){
                tab[i-1]=tab[i];
                i++;
            }tab[i-1]=x;
        }
    }
}
