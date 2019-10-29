package pl.mateusz.siedlecki.programowanie1.JavaStart.Polimorfizm;

public class HospitalApp {


    public static void main(String[] args) {
        Hospital hospital = new Hospital(3);

        hospital.add(new Doctor("Mateusz", "Siedlecki", 6500, 2500));
        hospital.add(new Nurse("Natalia", "Siedlecka", 3900, 42));

        System.out.println(hospital.getInfo());
    }
}
