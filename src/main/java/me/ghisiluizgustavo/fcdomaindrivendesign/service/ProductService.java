package me.ghisiluizgustavo.fcdomaindrivendesign.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.entity.Product;

import java.util.List;

public class ProductService {

    public static void increasePrice(List<Product> products, double percentage) {
        products.forEach(product -> {
            product.changePrice(product.getPrice() + (product.getPrice() * percentage) / 100);
        });
    }

}
