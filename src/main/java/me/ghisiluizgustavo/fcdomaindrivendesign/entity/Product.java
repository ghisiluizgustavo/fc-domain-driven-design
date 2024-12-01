package me.ghisiluizgustavo.fcdomaindrivendesign.entity;

public class Product {

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.validate();
    }

    private void validate(){
        if (this.id.isEmpty()) {
            throw new IllegalArgumentException("ID is empty");
        }

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
}
