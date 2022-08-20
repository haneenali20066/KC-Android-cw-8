package com.example.cw;

public class Food  {
    private String foodName;
    private int foodPrice ;
    private int foodImagee;

    public Food(String foodName, int foodPrice, int foodImage) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodImagee = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodImage() {
        return foodImagee;
    }

    public void setFoodImage(int foodImage) {
        this.foodImagee = foodImage;
    }


}
