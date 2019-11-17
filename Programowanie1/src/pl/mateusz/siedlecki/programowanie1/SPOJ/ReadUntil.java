package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadUntil {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String line;

        while (!(line = input.readLine()).equals("42")){
            answer.append(line);
            answer.append("\n");
        }

        System.out.println();
        System.out.println(answer);
    }
}
