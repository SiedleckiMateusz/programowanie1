package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(r);
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws Exception {

    }

    public void takeMatrix() throws IOException {

        String temp = bf.readLine();
        int numberOfColumns = 0;
        int numberOfRows = 0;

        String[] columnsAndRows = temp.split(" ");
        numberOfRows = Integer.parseInt(columnsAndRows[0]);
        numberOfColumns = Integer.parseInt(columnsAndRows[1]);

        String[][] someTab = new String[numberOfRows][numberOfColumns];

        takeElementsOfMatrix(someTab);

        showMyMatrix(someTab);
    }

    public void takeElementsOfMatrix(String[][] tab) throws IOException {
        for (int wiersz = 0; wiersz<tab.length; wiersz++){
            String row = bf.readLine();
            tab[wiersz]= row.split(" ");
        }
    }

    public void showMyMatrix(String[][] tab){
        for (int wiersz = 0; wiersz<tab[0].length; wiersz++){
            sb.append("\n");
            for (int kolumna = 0; kolumna<tab.length; kolumna++){
                sb.append(tab[kolumna][wiersz]);
                sb.append(" ");
            }

        }
        System.out.println(sb);
    }


}
