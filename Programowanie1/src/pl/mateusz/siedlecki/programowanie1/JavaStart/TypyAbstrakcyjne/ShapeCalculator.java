package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyAbstrakcyjne;

public class ShapeCalculator {

    public static void main(String[] args) {
        Shape circle1 = new Circle(15);
        Shape rectangle1 = new Rectangle(15,23);
        Shape triangle1 = new Triangle(5,4,10,12);

        System.out.println(circle1.toStringResult());
        System.out.println(triangle1.toStringResult());
        System.out.println(rectangle1.toStringResult());
    }
}
