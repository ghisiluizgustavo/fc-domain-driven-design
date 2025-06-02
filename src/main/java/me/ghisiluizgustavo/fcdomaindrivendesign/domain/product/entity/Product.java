package me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.entity;


public class Product {

    private final String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.validate();
    }

    private void validate(){
        if (this.name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }

        if (this.price == 0.0) {
            throw new IllegalArgumentException("Price is zero");
        }
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
