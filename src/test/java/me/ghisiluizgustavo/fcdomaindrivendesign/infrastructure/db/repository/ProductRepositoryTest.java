package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    @DisplayName("Should create a product")
    public void test(){
        repository.create(new Product(null, "Product 01", 100.0));

        Product product = repository.findByName("Product 01");

        assertEquals("Product 01", product.getName());
    }

}
