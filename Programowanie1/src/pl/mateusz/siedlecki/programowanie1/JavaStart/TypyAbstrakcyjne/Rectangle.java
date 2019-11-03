package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyAbstrakcyjne;

public class Rectangle implements Shape {
    private double firstSide;
    private double secondSide;

    Rectangle(double firstSide, double secondSide){
        this.firstSide =firstSide;
        this.secondSide = secondSide;
    }


    @Override
    public double circut() {
        return this.firstSide*2+this.secondSide*2;
    }

    @Override
    public double filed() {
        return this.firstSide*this.secondSide;
    }

    @Override
    public String toStringResult() {
        return ("PROSTOKĄT, pole: "+filed()+", obwód: "+circut());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
