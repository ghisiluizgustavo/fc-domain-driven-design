package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, String> {

    ProductEntity findByName(String name);

}
