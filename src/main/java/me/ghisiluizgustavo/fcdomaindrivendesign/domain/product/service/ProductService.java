package me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.entity.Product;

import java.util.List;

public class ProductService {

    public static void increasePrice(List<Product> products, double percentage) {
        products.forEach(product -> {
            product.changePrice(product.getPrice() + (product.getPrice() * percentage) / 100);
        });
    }

}
