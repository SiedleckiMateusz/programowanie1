package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyGeneryczne;

public class TestGeneric {


    public static void main(String[] args) {
        Pair<String, Boolean> para1 = new Pair<>("Mateusz", true);
        System.out.println(para1);
    }
}
