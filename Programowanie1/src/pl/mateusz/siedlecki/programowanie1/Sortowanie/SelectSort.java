package pl.mateusz.siedlecki.programowanie1.Sortowanie;

public class SelectSort<T extends Comparable<T>> implements Sort<T>  {

    public static void main(String[] args) {
        Integer[] tab = {21,523,3,52,65,1};
        SelectSort<Integer> ss = new SelectSort<>();
        ss.show(tab);
        ss.sort(tab);
        System.out.println();
        ss.show(tab);
    }

    @Override
    public void sort(T[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            swap(i, findIndexSmallest(i,tablica), tablica);
        }
    }

    public int findIndexSmallest(int i, T[] tablica) {
        T min = tablica[i];
        int indexForMin = i;

        for (int j = i+1; j < tablica.length; j++) {
            if (min.compareTo(tablica[j]) > 0) {
                min = tablica[j];
                indexForMin = j;
            }
        }
        return indexForMin;
    }

    public void swap(int index1, int index2, T[] tablica) {
        T buffor = tablica[index1];
        tablica[index1] = tablica[index2];
        tablica[index2] = buffor;
    }

    public void show(T[] tablica) {
        for (T s : tablica) {
            System.out.print(s + ", ");
        }
    }


}
