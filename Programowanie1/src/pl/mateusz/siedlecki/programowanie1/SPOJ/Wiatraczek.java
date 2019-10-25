package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Wiatraczek {
    public StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws Exception {
        int rozmiar;
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(r);

        Wiatraczek m = new Wiatraczek();
        List<Integer> myList = new LinkedList<>();

        do {
            rozmiar = Integer.parseInt(bf.readLine());
            if(rozmiar!=0){
                myList.add(rozmiar);
            }
        }while (rozmiar!=0);

        for (int i=0; i<myList.size(); i++){
            m.narysujWiatraczek(myList.get(i));
        }
        m.pokazMojeWiatraczki();

    }

    public void pokazMojeWiatraczki(){
        System.out.println(sb);
    }



    public void narysujWiatraczek(int rozmiar){
        if (rozmiar>0){
            rysujLewoskretny(rozmiar);
        }else{
            rysujPrawoskretny(rozmiar);
        }
        sb.append("\n");

    }

    public void rysujLewoskretny(int rozmiar){
        for (int i = 0; i<rozmiar; i++){
            rysujTrojkat(rozmiar,RodzajTrojkata.DOL_LEWO,i+1);
            rysujTrojkat(rozmiar,RodzajTrojkata.GORA_LEWO,i+1);
            sb.append("\n");
        }
        for (int i = 0; i<rozmiar; i++){
            rysujTrojkat(rozmiar,RodzajTrojkata.DOL_PRAWO,i+1);
            rysujTrojkat(rozmiar, RodzajTrojkata.GORA_PRAWO, i+1);
            sb.append("\n");
        }
    }

    public void rysujPrawoskretny(int rozmiar){
        rozmiar*=(-1);

        for (int i = 0; i<rozmiar; i++){
            rysujTrojkat(rozmiar,RodzajTrojkata.GORA_PRAWO,i+1);
            rysujTrojkat(rozmiar,RodzajTrojkata.DOL_PRAWO,i+1);
            sb.append("\n");
        }
        for (int i = 0; i<rozmiar; i++){
            rysujTrojkat(rozmiar,RodzajTrojkata.GORA_LEWO,i+1);
            rysujTrojkat(rozmiar, RodzajTrojkata.DOL_LEWO, i+1);
            sb.append("\n");
        }

    }

    public void rysujTrojkat(int rozmiar,RodzajTrojkata rodzaj, int linia){
        switch (rodzaj){
            case DOL_LEWO:
                rysujGwiazdke(linia);
                rysujKropke(rozmiar-linia);
                break;
            case DOL_PRAWO:
                rysujKropke(rozmiar-linia);
                rysujGwiazdke(linia);
                break;
            case GORA_LEWO:
                rysujGwiazdke(rozmiar-linia+1);
                rysujKropke(linia-1);
                break;
            case GORA_PRAWO:
                rysujKropke(linia-1);
                rysujGwiazdke(rozmiar-linia+1);
                break;
        }
    }

    public void rysujGwiazdke(int ile){
        for (int i = 0; i<ile; i++){
            sb.append("*");
        }
    }

    public void rysujKropke(int ile){
        for (int i = 0; i<ile; i++){
            sb.append(".");
        }
    }
}

enum RodzajTrojkata{
    GORA_LEWO,GORA_PRAWO,DOL_LEWO,DOL_PRAWO;
}

