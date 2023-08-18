package ru.otus.elenakovaleva.lesson12hm6;

public class Plate {
    private int maxAmountFood;
    private int currentAmountFood;

    public Plate(int maxAmountFood, int currentAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.currentAmountFood = currentAmountFood;
    }

    public int getCurrentAmountFood() {
        return currentAmountFood;
    }

    protected void addFood(int amount) {
        if (amount <= maxAmountFood && amount <= currentAmountFood) {
            currentAmountFood += amount;
        }
    }

    protected boolean decreaseFood(int eatAmount) {
        if(currentAmountFood < eatAmount) {
            return false;
        }
        currentAmountFood -= eatAmount;
        return true;
    }

    protected void infoPlate() {
        System.out.println("В тарелке " + currentAmountFood);
    }
}
