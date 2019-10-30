package pl.mateusz.siedlecki.programowanie1.JavaStart.Stringi;

import java.util.Scanner;

public class Stringi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość słów");
        int numberOfWords = Integer.parseInt(sc.nextLine());

        String wordFromLastLetters = "";

        for (int i = 0; i< numberOfWords; i++){
            System.out.println("Podaj "+(i+1)+" wyraz");
            String buffor = sc.nextLine();
            wordFromLastLetters = wordFromLastLetters + buffor.charAt(buffor.length()-1);
        }

        System.out.println("Utowrzony wyraz to: "+wordFromLastLetters);
    }
}
