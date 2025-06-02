package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.product.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductJpa, String> {

    ProductJpa findByName(String name);

}
