package pl.mateusz.siedlecki.programowanie1.JavaStart.Wyjatki;

public class Calculator {
    private float firstNumber;
    private float secondNumber;
    private String operator;

    public Calculator(float a, String operator, float b){
        this.firstNumber = a;
        this.operator = operator;
        this.secondNumber = b;
    }

    public float calculate()throws UnknowOperatorExeption,ArithmeticException{
        switch (this.operator){
            case "+":
                return firstNumber+secondNumber;
            case "-":
                return firstNumber-secondNumber;
            case "/":
                if (secondNumber==0){
                    throw new ArithmeticException("You can not divide by zero!");
                }else{
                    return firstNumber/secondNumber;
                }
            case "*":
                return firstNumber*secondNumber;
            default:
               throw new UnknowOperatorExeption("Wrong operator! "+this.operator);
        }
    }



    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
