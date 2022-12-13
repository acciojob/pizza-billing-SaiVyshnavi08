package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice ;
    private int ToppingsPrice;
    private int TakeAwayPrice ;


     boolean isCheeseAdded ;
    boolean isToppingsAdded ;
    boolean isBackPackOpted ;
     boolean  isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg= isVeg;
       this.cheesePrice=80;
       this.TakeAwayPrice =20;

        if(isVeg==true){
            this.price = 300;
            this.ToppingsPrice = 70;
        }
        else{
            this.price =400;
            this.ToppingsPrice =120;
        }

        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isBackPackOpted = false;
       this.bill =  "Base Price Of The Pizza:" + this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded == false) {
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(isToppingsAdded == false){
            this.price = this.price + this.ToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (isBackPackOpted == false) {
            this.price = this.price + this.TakeAwayPrice;
            isBackPackOpted = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isBillGenerated== false) {

           if (isCheeseAdded == true) {
               this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
           }
           if (isToppingsAdded == true) {
               this.bill = this.bill + "Extra Toppings Added:" + this.ToppingsPrice + "\n";
           }

           if (isBackPackOpted == true) {
               this.bill = this.bill + "Paperbag Added:" + this.TakeAwayPrice + "\n";
           }
           this.bill = this.bill + "Total Price: " + this.price + "\n";
           isBillGenerated = true;
       }
        return this.bill;
    }
}
