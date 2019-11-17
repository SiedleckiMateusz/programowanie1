package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food;

import pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Animals.TypeOfAnimal;


public enum FoodTypes {
    GRAINS(new TypeOfAnimal[]{TypeOfAnimal.BIRD, TypeOfAnimal.HAMSTER, TypeOfAnimal.RAT}),
    WEGETABLES(new TypeOfAnimal[]{TypeOfAnimal.RAT, TypeOfAnimal.HAMSTER}),
    MILK(new TypeOfAnimal[]{TypeOfAnimal.CAT}),
    DRY_FOOD_FOR_DOGS(new TypeOfAnimal[]{TypeOfAnimal.DOG, TypeOfAnimal.CAT}),
    DRY_FOOD_FOR_CATS(new TypeOfAnimal[]{TypeOfAnimal.CAT, TypeOfAnimal.DOG}),
    DRY_FOOD_FOR_FISH(new TypeOfAnimal[]{TypeOfAnimal.FISH}),
    GARBAGE_DINNER(new TypeOfAnimal[]{TypeOfAnimal.CAT, TypeOfAnimal.DOG, TypeOfAnimal.RAT,TypeOfAnimal.HAMSTER});


    private TypeOfAnimal[] typeOfAnimals;



    FoodTypes(TypeOfAnimal[] types){
        this.typeOfAnimals = types;
    }

    public TypeOfAnimal[] getTypeOfAnimals() {
        return typeOfAnimals;
    }


    public void setTypeOfAnimals(TypeOfAnimal[] typeOfAnimals) {
        this.typeOfAnimals = typeOfAnimals;
    }
}
