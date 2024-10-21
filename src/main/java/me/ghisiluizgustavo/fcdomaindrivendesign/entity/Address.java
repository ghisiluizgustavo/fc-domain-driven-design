package me.ghisiluizgustavo.fcdomaindrivendesign.entity;

public record Address (String street, Integer number, String zip, String city) {
    public Address {
        if (street == null) {
            throw new IllegalArgumentException("Street cannot be null");
        }
        if (number == null) {
            throw new IllegalArgumentException("Street cannot be null");
        }
        if (zip == null) {
            throw new IllegalArgumentException("Street cannot be null");
        }
        if (city == null) {
            throw new IllegalArgumentException("Street cannot be null");
        }
    }

}
