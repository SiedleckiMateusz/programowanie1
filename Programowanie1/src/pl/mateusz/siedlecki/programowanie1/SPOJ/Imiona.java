package pl.mateusz.siedlecki.programowanie1.SPOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Imiona {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(r);


    public static void main(String[] args) throws Exception {
        Imiona m = new Imiona();
        m.pobierzDane();
    }

    public void pobierzDane() throws Exception {
        String osoba;
        String imie;
        String[] tablicaSlow;
        LinkedList<IleImion> listaImion = new LinkedList<>();
        boolean jestJuzImie = false;

        do {
            jestJuzImie = false;
            osoba = bf.readLine();
            if (!osoba.isEmpty()) {
                tablicaSlow = osoba.split(" ");
                imie = tablicaSlow[2];
                imie = imie.toUpperCase();

                for (IleImion ileImion : listaImion) {
                    if (ileImion.getImie().equals(imie)) {
                        ileImion.setIle(ileImion.getIle() + 1);
                        jestJuzImie = true;
                    }
                }

                if (!jestJuzImie) {
                    listaImion.addLast(new IleImion(imie, 1));
                }

            }

        } while (!osoba.isEmpty());
        //Jak czytać tekst do ostatniej lini !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        listaImion.sort(IleImion::compareTo);


        for (IleImion ileImion : listaImion) {
            System.out.println(ileImion);
        }

    }

}


class IleImion implements Comparable {
    String imie;
    int ile;

    IleImion(String imie, int ile) {
        this.imie = imie;
        this.ile = ile;
    }

    public String getImie() {
        return imie;
    }

    public int getIle() {
        return ile;
    }

    public void setIle(int ile) {
        this.ile = ile;
    }

    @Override
    public String toString() {
        return (this.imie + " " + this.ile);
    }

    @Override
    public int compareTo(Object o) {
        IleImion ileImion;
        int wynik;
        if (o instanceof IleImion) {
            ileImion = (IleImion) o;
            wynik = Integer.compare(ileImion.getIle(), this.getIle());
            if (wynik == 0) {
                return this.getImie().compareTo(ileImion.getImie());
            } else {
                return wynik;
            }
        }
        return 0;
    }
}
