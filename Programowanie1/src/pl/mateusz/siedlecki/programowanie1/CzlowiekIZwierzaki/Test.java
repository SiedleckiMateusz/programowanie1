package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals.HungerAnimals;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals.MyAnimal;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals.TypeOfAnimal;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.Food;
import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.FoodTypes;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyAnimal a1 = new MyAnimal("Berlin", "Hau hau", TypeOfAnimal.DOG, 2, 0, Arrays.asList(FoodTypes.DRY_FOOD_FOR_DOGS,FoodTypes.GARBAGE_DINNER,FoodTypes.DRY_FOOD_FOR_CATS),10);
        MyAnimal a2 = new MyAnimal("Moskwa", "Miau miau", TypeOfAnimal.CAT, 1, 2, Arrays.asList(FoodTypes.DRY_FOOD_FOR_CATS, FoodTypes.MILK),4);
        MyAnimal a3 = new MyAnimal("Denver", "Cwir Cwir", TypeOfAnimal.BIRD, 2, 5, Arrays.asList(FoodTypes.GRAINS, FoodTypes.WEGETABLES), 10);

        Food f1 = new Food(FoodTypes.DRY_FOOD_FOR_CATS, 90, 5);
        Food f2 = new Food(FoodTypes.MILK, 90, 5);
        Food f3 = new Food(FoodTypes.GRAINS, 90, 5);
        Food f4 = new Food(FoodTypes.DRY_FOOD_FOR_DOGS, 90,5);

        Person p1 = new Person(Arrays.asList(a1,a2,a3),Arrays.asList(f1,f2,f3,f4));

        Thread hungerThread = createUsageThread(p1.getMyAnimals(), p1.getFoodForAnimals());
        hungerThread.start();

        p1.takeCareOfAnimals();

        hungerThread.stop();
    }

    private static Thread createUsageThread(List<MyAnimal> animals, List<Food> foods){
        return new Thread(new HungerAnimals(animals,foods));
    }
}
