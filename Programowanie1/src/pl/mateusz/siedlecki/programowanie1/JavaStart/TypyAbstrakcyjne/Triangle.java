package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyAbstrakcyjne;

public class Triangle implements Shape {
    private double height;
    private double basis;

    private double firstArm;
    private double secondArm;

    public Triangle(double height, double firstArm, double secondArm, double basis){
        this.height = height;
        this.firstArm = firstArm;
        this.secondArm = secondArm;
        this.basis = basis;
    }

    @Override
    public double circut() {
        return firstArm+secondArm+basis;
    }

    @Override
    public double filed() {
        return (0.5d*height*basis);
    }

    @Override
    public String toStringResult() {
        return ("TRÓJKĄT, pole: "+filed()+", obwód: "+circut());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    public double getFirstArm() {
        return firstArm;
    }

    public void setFirstArm(double firstArm) {
        this.firstArm = firstArm;
    }

    public double getSecondArm() {
        return secondArm;
    }

    public void setSecondArm(double secondArm) {
        this.secondArm = secondArm;
    }
}
