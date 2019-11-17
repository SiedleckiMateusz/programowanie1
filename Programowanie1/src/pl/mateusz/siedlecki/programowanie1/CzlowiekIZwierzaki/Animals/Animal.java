package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food.Food;

public interface Animal {

    String introduceYourself();

    String speak();

    boolean isHoungry();

    boolean feed(Food food);


}
