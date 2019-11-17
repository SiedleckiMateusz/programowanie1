package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.Food;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.FoodTypes;
import java.util.List;

public abstract class AbstractAnimal implements Animal {
    private TypeOfAnimal type;
    private int bitSize;
    private List<FoodTypes> preferencesFoods;
    private int numbersOfBitesWhenFull;
    private int houngryLevel = 0;


    public AbstractAnimal(TypeOfAnimal type, int bitSize, int actualFoodLevel, List<FoodTypes> foodForMyAnimals, int numbersOfBitesWhenFull) {
        this.type = type;
        this.bitSize = bitSize;
        this.houngryLevel = actualFoodLevel;
        this.preferencesFoods = foodForMyAnimals;
        this.numbersOfBitesWhenFull = numbersOfBitesWhenFull;
    }

    @Override
    public boolean isHoungry() {
        return houngryLevel>0;
    }

    @Override
    public boolean feed(Food food) {
            if (preferencesFoods.contains(food.getFoodName()) && food.getQuantity()>=bitSize){
                houngryLevel--;
                food.setQuantity(food.getQuantity()-bitSize);
                return true;
            }
            return false;
        }


    public TypeOfAnimal getType() {
        return type;
    }

    public void setType(TypeOfAnimal type) {
        this.type = type;
    }

    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }

    public List<FoodTypes> getPreferencesFoods() {
        return preferencesFoods;
    }

    public void setPreferencesFoods(List<FoodTypes> preferencesFoods) {
        this.preferencesFoods = preferencesFoods;
    }

    public int getNumbersOfBitesWhenFull() {
        return numbersOfBitesWhenFull;
    }

    public void setNumbersOfBitesWhenFull(int numbersOfBitesWhenFull) {
        this.numbersOfBitesWhenFull = numbersOfBitesWhenFull;
    }

    public int getHoungryLevel() {
        return houngryLevel;
    }

    public void setHoungryLevel(int houngryLevel) {
        this.houngryLevel = houngryLevel;
    }
}
