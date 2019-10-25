package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MniejszeNiz {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(r);
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws Exception {
        MniejszeNiz m = new MniejszeNiz();
        m.pobierzDane();
    }

    public void pobierzDane() throws Exception{
        int ileLiczb = Integer.parseInt(bf.readLine());
        int[] zbiorLiczb = new int[ileLiczb];

        for (int i=0; i<ileLiczb; i++){
            zbiorLiczb[i] = Integer.parseInt(bf.readLine());
        }
        bf.readLine();

        int ileDoPorownania = Integer.parseInt(bf.readLine());
        int[] zbiorLiczbDoPorownania = new int[ileDoPorownania];

        for (int i = 0; i<ileDoPorownania; i++){
            zbiorLiczbDoPorownania[i] = Integer.parseInt(bf.readLine());
        }

        sb.append("\n");
        for (int i = 0; i<ileDoPorownania; i++){
            sb.append(ileMniejszych(zbiorLiczb, zbiorLiczbDoPorownania[i]));
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public int ileMniejszych(int[] tab, int liczba){
        int ile = 0;
        for (int i = 0; i<tab.length; i++){
            if (tab[i]<liczba){
                ile++;
            }
        }
        return ile;
    }
}
