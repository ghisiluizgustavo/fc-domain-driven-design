package me.ghisiluizgustavo.fcdomaindrivendesign.domain.checkout.entity;

public record OrderItem(String id, String name, Double price, String productId, Integer quantity) { }
