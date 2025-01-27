package Lecture9;

public class exercise3 {
    public static void main(String[] args) {
        Product product1 = new Product("glass", 10.0, "household", 12);

        product1.putOnSale();
        product1.calculateDiscount();
        product1.showInfo();

        Product product2 = new Product("table", 250.0, "furniture", 10);
        product2.putOnSale();
        product2.calculateDiscount();
        product2.showInfo();

        Product product3 = new Product("table", 250.0, "furniture", 10);
        product3.calculateDiscount();
        product3.showInfo();

        Product product4 = new Product("coffeemachine", 560, "household appliances", 1);
        product4.putOnSale();
        product4.calculateDiscount();
        product4.showInfo();
    }
}
