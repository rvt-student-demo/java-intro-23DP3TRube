package lv.rvt;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.quantity = 13;
        this.name = initialName;
        this.price = 1.1;
    }

    public void printPerson() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity);
    }
}