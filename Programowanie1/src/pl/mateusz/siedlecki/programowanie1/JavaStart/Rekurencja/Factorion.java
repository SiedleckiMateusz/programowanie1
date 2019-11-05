package pl.mateusz.siedlecki.programowanie1.JavaStart.Rekurencja;

public class Factorion {

    public static void main(String[] args) {
        System.out.println("5! jest równa: "+factorion(5));
        System.out.println("3! jest równa: "+factorion(3));
        System.out.println("2! jest równa: "+factorion(2));
    }

    public static int factorion(int n){
        if (n>1){
            return n*factorion(n-1);
        }else {
            return n;
        }
    }
}
