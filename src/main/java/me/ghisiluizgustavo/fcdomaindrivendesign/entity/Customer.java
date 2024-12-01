package me.ghisiluizgustavo.fcdomaindrivendesign.entity;

public class Customer {

    private final String id;
    private String name;
    private Address address;
    private Boolean active;
    private double rewardPoints = 0;

    public Customer(final String id, final String name) {
        this.id = id;
        this.name = name;
        validate();
    }

    private void validate() {
        if (this.id.isBlank()) {
            throw new IllegalArgumentException("Id is required");
        }
        if (this.name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
    }

    public void changeName(final String newName) {
        this.name = newName;
        validate();
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public void activate(){
        if (this.address == null) {
            throw new IllegalArgumentException("Address is mandatory to activate a customer");
        }
        this.active = true;
    }

    public void deactivate(){
        this.active = false;
    }

    public boolean isActive() {
        return this.active;
    }

    public void addRewardPoints(double rewardPoints) {
        this.rewardPoints += rewardPoints;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }
}
