package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyGeneryczne;

public class Pair<T,N> {
    private T firstArgument;
    private N secondArgument;

    Pair(T firstArgument, N secondArgument){
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    @Override
    public String toString() {
        return ("Pierwszy argument : "+this.firstArgument.toString()+", drugi argument: "+this.secondArgument.toString());
    }

    public T getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(T firstArgument) {
        this.firstArgument = firstArgument;
    }

    public N getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(N secondArgument) {
        this.secondArgument = secondArgument;
    }
}
