package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean away;
    private boolean cheese;
    private boolean topping;
    private boolean billgen;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        billgen = false;
        away = false;
        cheese = false;
        topping = false;
        if(isVeg) this.price = 300;
        else this.price = 400;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese && !billgen) {
            cheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!topping && !billgen){
            if(isVeg) this.price += 70;
            else this.price += 120;
            topping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!away && !billgen){
            this.price += 20;
            away = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billgen) {
            if (isVeg) {
                bill += "Base Price Of The Pizza: 300";
                bill += "\n";
            } else {
                bill += "Base Price Of The Pizza: 400";
                bill += "\n";
            }

            if (cheese) {
                bill += "Extra Cheese Added: 80";
                bill += "\n";
            }
            if (topping) {
                if (!isVeg) {
                    bill += "Extra Toppings Added: 120";
                    bill += "\n";
                } else {
                    bill += "Extra Toppings Added: 70";
                    bill += "\n";
                }
            }
            if (away) {
                bill += "Paperbag added: 20";
                bill += "\n";
            }
            bill += ("Total price: " + getPrice());
            bill += "\n";
            billgen = true;
        }
        return this.bill;
    }
}
