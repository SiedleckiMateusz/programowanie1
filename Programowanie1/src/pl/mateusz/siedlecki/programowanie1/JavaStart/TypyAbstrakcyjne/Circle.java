package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyAbstrakcyjne;

public class Circle implements Shape {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double circut() {
        return 2*Shape.PI*radius;
    }

    @Override
    public double filed() {
        return Shape.PI*radius*radius;
    }

    @Override
    public String toStringResult() {
        return ("KOŁO, pole: "+filed()+", obwód: "+circut());
    }
}
