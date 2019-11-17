package pl.mateusz.siedlecki.programowanie1.CzlowiekIZwierzaki.Food;

public class Food {
    private FoodTypes foodName;
    private int quantity;
    private int price;

    public Food(FoodTypes food, int quantity, int price) {
        this.foodName = food;
        this.quantity = quantity;
        this.price = price;
    }

    public FoodTypes getFoodName() {
        return foodName;
    }

    public void setFoodName(FoodTypes foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return (foodName+" "+quantity);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
