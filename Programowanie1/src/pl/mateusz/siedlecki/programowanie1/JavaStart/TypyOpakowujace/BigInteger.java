package pl.mateusz.siedlecki.programowanie1.JavaStart.TypyOpakowujace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigInteger {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(r);

    public static void main(String[] args) throws IOException {
        BigInteger bi = new BigInteger();
        System.out.println("Suma cyfr wynosi: "+bi.sumNumbers());
        System.out.println("Suma BigIntegerów wynosi: "+bi.sumBigIntegers());
    }

    public int sumNumbers() throws IOException {
        int sum = 0;

        int howMAnyIntegers = Integer.parseInt(bf.readLine());
        for (int i = 0; i<howMAnyIntegers ;i++){
            sum+= Integer.parseInt(bf.readLine());
        }
        return sum;
    }


    java.math.BigInteger sumBigIntegers() throws IOException {
        int howMAnyIntegers = Integer.parseInt(bf.readLine());
        java.math.BigInteger sum = new java.math.BigInteger("0");
        for (int i = 0; i<howMAnyIntegers; i++){

            sum = sum.add(new java.math.BigInteger(bf.readLine()));
        }
        return sum;
    }
}
