package me.ghisiluizgustavo.fcdomaindrivendesign.domain.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;

import java.util.List;

public class ProductService {

    public static void increasePrice(List<Product> products, double percentage) {
        products.forEach(product -> {
            product.changePrice(product.getPrice() + (product.getPrice() * percentage) / 100);
        });
    }

}
