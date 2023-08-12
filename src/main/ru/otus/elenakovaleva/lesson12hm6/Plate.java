package ru.otus.elenakovaleva.lesson12hm6;

public class Plate {
    protected int maxAmountFood;
    protected int currentAmountFood;

    public Plate(int maxAmountFood, int currentAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.currentAmountFood = currentAmountFood;
    }

    protected void addFood(int amount) {
        if (amount >= currentAmountFood && amount <= maxAmountFood) {
            currentAmountFood += amount;
        }
    }

    protected boolean decreaseFood(int eatAmount) {
        if(currentAmountFood >= eatAmount) {
            currentAmountFood -= eatAmount;
        }

        if (currentAmountFood >= 0) {
            return true;
        } else {
            return false;
        }
    }

    protected void infoPlane() {
        System.out.println("В тарелке " + currentAmountFood);
    }
}
