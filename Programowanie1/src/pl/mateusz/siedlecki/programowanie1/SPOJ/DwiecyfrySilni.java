package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DwiecyfrySilni{

    public static void main(String[] args) throws IOException {
        double time1 = System.currentTimeMillis();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int howManyNumbers = Integer.parseInt(input.readLine());
        int actualNumber;

        for (int i =0; i<howManyNumbers; i++){
            actualNumber = power(Integer.parseInt(input.readLine()));
            answer.append((actualNumber/10)%10);
            answer.append(" ");
            answer.append(actualNumber%10);
            answer.append("\n");
        }

        System.out.println(answer);
        double time2 = System.currentTimeMillis();

        System.out.println(time2-time1);
    }

    public static int power(int number){
        int wynik =1;
        if (number==1){
            return 1;
        }else {
            for (int i=1; i<=number; i++){
                wynik*=i;
            }
            return wynik;
        }
    }
}
