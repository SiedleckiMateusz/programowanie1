package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals.MyAnimal;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.Food;

import java.util.List;

public class Person {
    private List<MyAnimal> myAnimals;
    private List<Food> foodForAnimals;
    private Integer money;

    Person(List<MyAnimal> myAnimals, List<Food> foodForAnimals){
        this.myAnimals = myAnimals;
        this.foodForAnimals = foodForAnimals;
    }

    public void feed(){

        for (MyAnimal animal : myAnimals){
            for (Food food : foodForAnimals){
                while (animal.isHoungry()){
                    if (!animal.feed(food)){
                        break;
                    }

                }

            }

        }
    }

    public void takeCareOfAnimals(){
        while (chceckFoodSupply()){
            feed();
        }

        System.out.println("Nie ma więcej jedzenia");
    }

    public boolean chceckFoodSupply(){
        for (Food food: foodForAnimals){
            if (food.getQuantity()>0){
                return true;
            }
        }
        return false;
    }

    public List<MyAnimal> getMyAnimals() {
        return myAnimals;
    }

    public void setMyAnimals(List<MyAnimal> myAnimals) {
        this.myAnimals = myAnimals;
    }

    public List<Food> getFoodForAnimals() {
        return foodForAnimals;
    }

    public void setFoodForAnimals(List<Food> foodForAnimals) {
        this.foodForAnimals = foodForAnimals;
    }
}
