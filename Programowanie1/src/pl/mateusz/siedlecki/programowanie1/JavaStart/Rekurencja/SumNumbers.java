package pl.mateusz.siedlecki.programowanie1.JavaStart.Rekurencja;

public class SumNumbers {

    public static void main(String[] args) {
        SumNumbers sn = new SumNumbers();
        System.out.println("SUMOWANIE 5 LICZB DAJE WYNIK: "+sum(5));
        System.out.println("SUMOWANIE REKURENCJĄ 5 LICZB DAJE WYNIK: "+sn.recursionSum(5));
    }

    public static int sum(int n){
        int sum =0;
        for (int i = n; i>0; i--){
            sum+=i;
        }
        return sum;
    }

    public int recursionSum(int n){
        if (n>1){
            return n+recursionSum(n-1);
        }else{
            return n;
        }
    }


}
