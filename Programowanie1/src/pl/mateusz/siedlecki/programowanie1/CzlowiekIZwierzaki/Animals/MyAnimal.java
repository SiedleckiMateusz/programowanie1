package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.FoodTypes;

import java.util.List;

public class MyAnimal extends AbstractAnimal {
    private String name;
    private String voice;

    public MyAnimal(String name, String voice, TypeOfAnimal type, int bitSize, int actualFoodLevel, List<FoodTypes> foodForMyAnimals, int numbersOfBitesWhenFull) {
        super(type, bitSize, actualFoodLevel, foodForMyAnimals, numbersOfBitesWhenFull);
        this.name = name;
        this.voice = voice;
    }


    @Override
    public String introduceYourself() {
        return ("Cześć nazywam się "+name+" i jestem "+super.getType());
    }

    @Override
    public String speak() {
        return voice;
    }

    public void makeHungry(){
        super.setHoungryLevel(getHoungryLevel()+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return (this.name+" "+super.getType()+" "+super.getHoungryLevel());
    }
}
