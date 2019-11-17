package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals;


import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.Food;

import java.util.List;
import java.util.Random;

public class HungerAnimals implements Runnable {
    List<MyAnimal> animals;
    List<Food> food;

    Random r = new Random();


    public HungerAnimals(List<MyAnimal> animals, List<Food> food) {
        this.animals = animals;
        this.food = food;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(r.nextInt(2000));
                System.out.println(animals);
                System.out.println(food);

                int range = animals.size();
                MyAnimal pet = animals.get(r.nextInt(range));
                int newHangryLevel = r.nextInt(10) + 1;
                pet.setHoungryLevel(pet.getHoungryLevel()+newHangryLevel);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
