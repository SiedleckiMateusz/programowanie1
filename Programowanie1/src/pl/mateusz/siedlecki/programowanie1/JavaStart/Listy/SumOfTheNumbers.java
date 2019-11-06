package pl.mateusz.siedlecki.programowanie1.JavaStart.Listy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfTheNumbers {
    List<Integer> numberList = new ArrayList<>();
    InputStreamReader r = new InputStreamReader(System.in);
    public BufferedReader bf = new BufferedReader(r);

    public static void main(String[] args) throws IOException {
        SumOfTheNumbers sn = new SumOfTheNumbers();
        sn.getNext();


    }

    public void getNext() throws IOException {

        String number = bf.readLine();
        if (number.equals("exit")){
            sumElementOfList();
        }else {
            try{
                numberList.add(Integer.parseInt(number));

            }catch (NumberFormatException e){
                System.err.println("Liczba w niepoprawnym formacie");
            }
            getNext();
        }
    }

    public void sumElementOfList(){
        int sum =0;
        for (int i = 0; i<numberList.size()-1; i++){
            sum+=numberList.get(i);
            System.out.print(numberList.get(i)+" + ");
        }
        sum+=numberList.get(numberList.size()-1);

        System.out.print(numberList.get(numberList.size()-1)+" = "+sum);
    }
}
