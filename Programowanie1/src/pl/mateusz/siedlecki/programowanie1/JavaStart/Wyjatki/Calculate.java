package pl.mateusz.siedlecki.programowanie1.JavaStart.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first = 0, second = 0, result = 0;
        String operator = null;
        boolean error = false;

        try{
            System.out.println("Podaj pierwsza liczbe: ");
            first = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.println("Podaj znak: ");
            operator = sc.nextLine();
            System.out.println();
            System.out.println("Podaj drugą liczbę");
            second = sc.nextInt();
            sc.nextLine();

            Calculator calculator = new Calculator(first, operator, second);

            result = calculator.calculate();

        }catch (InputMismatchException ex){
            System.err.println("Value is incorrect type");
            ex.printStackTrace();
            error = true;
        }catch (UnknowOperatorExeption | ArithmeticException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            error = true;
        }

        if (!error){
            System.out.println(first+operator+second+"="+result);
        }else{
            System.out.println("Nie można obliczyć wyrażenia "+first+operator+second);
        }
    }

}
