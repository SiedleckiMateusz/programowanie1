package pl.mateusz.siedlecki.programowanie1.JavaStart.LambdaIInterfejsy;

@FunctionalInterface
interface IncrementalPrinter<T> {
    public T doSomething(T t);
}
