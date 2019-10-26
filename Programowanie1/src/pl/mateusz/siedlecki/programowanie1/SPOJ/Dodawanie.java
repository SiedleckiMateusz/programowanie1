package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dodawanie {


    public static void main(String[] args)throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        StringBuilder sb = new StringBuilder();

        int ileLiczb = Integer.parseInt(br.readLine());
        Para[] tablicaPar = new Para[ileLiczb];
        String liniaTekstu;
        String[] elementyLini;


        for (int i=0; i<tablicaPar.length; i++){
            liniaTekstu = br.readLine();
            elementyLini = liniaTekstu.split(" ");
            tablicaPar[i] = new Para(Integer.parseInt(elementyLini[0]), Integer.parseInt(elementyLini[1]));
        }

        for (int i=0; i<tablicaPar.length; i++){
            sb.append(tablicaPar[i].suma());
            sb.append("\n");
        }
    }

}

class Para{
    private int liczba1;
    private int liczba2;

    public Para(int l1, int l2){
        this.liczba1 = l1;
        this.liczba2 = l2;
    }

    public int suma(){
        return this.liczba1+this.liczba2;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }
}
