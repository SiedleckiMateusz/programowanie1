package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LiczbyPierwsze {

    public static void main(String[] args) throws IOException {
        List<Integer> numberList = new ArrayList<>();
        List<String> answerList = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number;
        String line;

        while (!(line=reader.readLine()).equals("")){
            number = Integer.valueOf(line);
            numberList.add(number);
        }

        for (Integer nr:numberList){
            if (isPrimeNumber(nr)){
                answerList.add("TAK");
            }else{
                answerList.add("NIE");
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s: answerList){
            result.append(s);
            result.append("\n");
        }

        System.out.println(result);
    }

    public static boolean isPrimeNumber(Integer number){
        for (int i = 2; i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
