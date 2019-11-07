package pl.mateusz.siedlecki.programowanie1.JavaStart.Mapy;

import java.util.Scanner;

public class CompanyApp {
    Scanner sc = new Scanner(System.in);
    Company company = new Company();
    String option = null;

    public static void main(String[] args) {
        CompanyApp ca = new CompanyApp();

        ca.menu();
    }

    public void menu(){
        do{

            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Znajdź pracownika");
            System.out.println("3. Wyjscie z programu");

            try{
                option = sc.nextLine();
            }catch (NumberFormatException e){
                System.out.println("To nie jest liczba");
            }

            switch (option){
                case "1":
                    company.addEmployee(createEmployee());
                    break;
                case "2":
                    findEmployee();
                    break;
                case "3":
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Niepoprawna wartość, spróbuj ponownie");
            }

        }while (!option.equals("3"));
    }

    public Employee createEmployee(){
        System.out.println("Podaj imie pracownika");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String lastName = sc.nextLine();
        System.out.println("Podaj wysokość pensji pracownika");
        int salary = Integer.parseInt(sc.nextLine());

        return new Employee(firstName,lastName,salary);
    }

    public void findEmployee(){
        System.out.println("Podaj imie i nazwisko pracownika");
        String key = sc.nextLine();

        Employee em = company.findEmployee(key);

        System.out.println("DANE PRACOWNIKA: "+(em==null? "nie ma takiego pracownika":em));
    }
}
