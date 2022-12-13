package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded =false;
    private boolean isVegToppingsAdded = false;
    private boolean isNonVegToppingsAdded = false;
    private boolean isBackPackOpted =false;

    private int pizzaprice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }
        else{
            this.price =400;
        }
        pizzaprice = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isCheeseAdded = true;
        this.price = this.price + 80;
    }

    public void addExtraToppings(){
        // your code goes here

        if(isVeg){
            isVegToppingsAdded = true;
            this.price = this.price+70;
        }
        else{
            isNonVegToppingsAdded =true;
            this.price = this.price +120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        isBackPackOpted =true;
        this.price = this.price +20;
    }

    public String getBill(){
        // your code goes here
        String bill ="";
       bill = bill + "Base Price Of The Pizza:"+ pizzaprice+ "\n";

        if(isCheeseAdded){
            bill = bill +"Extra Cheese Added: "+ 80 +"\n";
        }
        if(isVegToppingsAdded) {
            bill = bill + "Extra Toppings Added:" + 70+"\n";
        }
        if(isNonVegToppingsAdded) {
            bill = bill + "Extra Toppings Added:" + 120+"\n";
        }
        if(isBackPackOpted){
            bill = bill + "Paperbag Added:" + 20+"\n";
        }
        return this.bill;
    }
}
