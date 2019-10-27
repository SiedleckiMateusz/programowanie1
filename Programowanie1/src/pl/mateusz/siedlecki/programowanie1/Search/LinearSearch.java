package pl.mateusz.siedlecki.programowanie1.Search;

public class LinearSearch<T> implements Search<T> {

    public static void main(String[] args) {
        LinearSearch<Integer> search = new LinearSearch<>();
        Integer[] tab = {1,2,3,4,5,6,7,8};
        System.out.println(search.find(tab, 3));
    }

    @Override
    public int find(T[] tab, T value) {
        for (int i = 0; i<tab.length; i++){
            if (tab[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
