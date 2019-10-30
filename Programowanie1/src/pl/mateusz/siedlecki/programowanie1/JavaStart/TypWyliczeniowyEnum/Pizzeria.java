package pl.mateusz.siedlecki.programowanie1.JavaStart.TypWyliczeniowyEnum;

import java.util.Scanner;

public class Pizzeria {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TO SĄ NASZE PIZZE, KTÓRĄ WYBIERASZ?");
        for (Pizza name: Pizza.values()){
            System.out.println(name);
        }

        String wybrana = scanner.nextLine();
        Pizza  yourChoice;
        switch (wybrana){
            case "capriciosa":
                yourChoice = Pizza.CAPRICIOSA;
                break;
            case "margherita":
                yourChoice = Pizza.MARGHERITA;
                break;
            case "prosciutto":
                yourChoice = Pizza.PROSCIUTTO;
                break;
            default:
                yourChoice = null;
        }

        if (yourChoice!=null){
            System.out.println("WYBRANA PRZEZ CIEBIE PIZZA TO:");
            System.out.println(yourChoice.getIngredients());
        }else {
            System.out.println("NIE POSIADAMY TAKIEJ PIZZY W OFERCIE");
        }
    }
}
