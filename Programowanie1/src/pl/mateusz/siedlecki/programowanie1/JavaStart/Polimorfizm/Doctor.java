package pl.mateusz.siedlecki.programowanie1.JavaStart.Polimorfizm;

public class Doctor extends Person{
    private int bonusSalary;

    public Doctor(String firstName, String lastName, int salary, int bonusSalary){
        super(firstName, lastName, salary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public String toString() {
        return super.toString()+(", bonus: "+bonusSalary+" zł");
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
}
