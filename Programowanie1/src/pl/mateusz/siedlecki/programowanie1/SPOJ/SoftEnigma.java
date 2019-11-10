package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SoftEnigma {

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        StringBuilder answer = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        String sentence;
        do{
            sentence = br.readLine();

            if (!sentence.equals("")){
                answer.append(unlockSentence(sentence));
                answer.append("\n");
            }

        }while (!sentence.equals(""));


        System.out.println(answer);
    }

    public static String unlockSentence(String sentence){
        for (int i = 0; i<sentence.length()-1; i+=2){
            sentence = swapLetter(sentence, i,i+1);
        }
        return sentence;
    }

    public static String swapLetter(String sentence, int index1, int index2){
        StringBuilder mySentence = new StringBuilder(sentence);
        char buffor = mySentence.charAt(index1);
        mySentence.setCharAt(index1, mySentence.charAt(index2));
        mySentence.setCharAt(index2, buffor);

        return mySentence.toString();
    }
}
