package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.repository.ProductRepositoryInterface;
import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements ProductRepositoryInterface {

    private final JpaProductRepository repository;

    public ProductRepository(JpaProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Product domainEntity) {
        ProductEntity product = ProductEntity.create(domainEntity);
        repository.save(product);
    }

    @Override
    public void update(Product domainEntity) {

    }

    @Override
    public Product find(String id) {
        return repository
                .findById(id)
                .map(ProductEntity::toDomain)
                .orElseThrow();
    }

    public Product findByName(String name) {
        return repository.findByName(name).toDomain();
    }


    @Override
    public List<Product> findAll() {
        return repository
                .findAll()
                .stream()
                .map(ProductEntity::toDomain)
                .toList();
    }
}
