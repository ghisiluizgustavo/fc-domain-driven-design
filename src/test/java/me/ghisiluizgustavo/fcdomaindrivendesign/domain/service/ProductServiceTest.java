package me.ghisiluizgustavo.fcdomaindrivendesign.domain.service;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductServiceTest {

    @Test
    @DisplayName("should change the prices of all products")
    public void changePrices() {
        Product product01 = new Product("01", "Product 01", 10.0);
        Product product02 = new Product("02", "Product 02", 20.0);

        List<Product> products = List.of(product01, product02);

        ProductService.increasePrice(products, 100);

        Assertions.assertEquals(20, product01.getPrice());
        Assertions.assertEquals(40, product02.getPrice());
    }

}
