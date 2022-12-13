package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice =80;
    private int ToppingsPrice;
    private int TakeAwayPrice =20;


    private boolean isCheeseAdded ;
    private boolean isToppingsAdded ;
    private boolean isBackPackOpted ;
    private boolean  isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg= isVeg;
        isCheeseAdded =false;
        isToppingsAdded = false;
         isBackPackOpted =false;
         isBillGenerated = false;

        if(isVeg==true){
            this.price = 300;
            this.ToppingsPrice = 70;
        }
        else{
            this.price =400;
            this.ToppingsPrice =120;
        }
       bill = bill + "Base Price Of The Pizza:" + this.price +"\n";
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
            this.price = this.price + TakeAwayPrice;
            isBackPackOpted = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isBillGenerated== false) {
           isBillGenerated = true;
           if (isCheeseAdded == true) {
               bill = bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
           }
           if (isToppingsAdded == true) {
               bill = bill + "Extra Toppings Added:" + this.ToppingsPrice + "\n";
           }

           if (isBackPackOpted == true) {
               bill = bill + "Paperbag Added:" + this.TakeAwayPrice + "\n";
           }
           bill = bill + "Total Price: " + this.price + "\n";
       }
        return this.bill;
    }
}
