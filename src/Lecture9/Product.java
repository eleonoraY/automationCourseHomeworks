package Lecture9;

public class Product {
    String productName;
    double price;
    String category;
    int stockQuantity;
    boolean isOnSale;
    static String categoryOnSale = "furniture";

    public Product(String productName, double price, String category, int stockQuantity){
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    public void putOnSale(){
        if(stockQuantity > 0 && categoryOnSale == category) {
            isOnSale = true;
        } else{
            System.out.println("Тhe " + productName + " is not available.");
        }
    }


    public void calculateDiscount(){
        if(isOnSale){
            if(price > 100){
                double discount = price * 0.10;
                price -= discount;
            }
        } else {
            price = this.price;
        }
    }

    public void showInfo(){
        System.out.println("The product is " + productName + ". The category is " + category + " and the price is " + price + "$.");
    }
}
