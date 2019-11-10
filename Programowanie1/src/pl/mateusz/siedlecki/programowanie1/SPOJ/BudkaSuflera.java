package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class BudkaSuflera {
    public static void main(String[] args) throws IOException {
        List<String> words;
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        StringBuilder answer = new StringBuilder();

        String firstLine = br.readLine();
        String[] wordsInFirstLine = firstLine.split(" ");

        String secondLine = br.readLine();
        String[] wordsInSecondLine = secondLine.split(" ");

        int ileSlowBrakuje = wordsInFirstLine.length;

        for (int i=0; i<wordsInSecondLine.length; i++){
            for (int j=0; j<wordsInFirstLine.length; j++){
                if (wordsInSecondLine[i].equals(wordsInFirstLine[j])){
                    wordsInFirstLine[j] = null;
                    ileSlowBrakuje--;
                    break;
                }
            }
        }
        answer.append(ileSlowBrakuje);

        for (int i =0; i<wordsInFirstLine.length; i++){
            if (wordsInFirstLine[i]!=null){
                answer.append("\n");
                answer.append(wordsInFirstLine[i]);
            }

        }
        System.out.println(answer);

    }
}
