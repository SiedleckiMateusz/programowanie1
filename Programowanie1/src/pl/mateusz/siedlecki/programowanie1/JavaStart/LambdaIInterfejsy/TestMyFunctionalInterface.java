package pl.mateusz.siedlecki.programowanie1.JavaStart.LambdaIInterfejsy;

public class TestMyFunctionalInterface {
    public static void main(String[] args) {
        Integer num = 5;
        num = increment(num, x-> x+1);
    }

    public static <T> T increment(T t, IncrementalPrinter<T> ip){
        return ip.doSomething(t);
    }
}
