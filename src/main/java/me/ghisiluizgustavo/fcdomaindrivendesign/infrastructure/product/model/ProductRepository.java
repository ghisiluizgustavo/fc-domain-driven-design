package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.product.model;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.entity.Product;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.product.repository.ProductRepositoryInterface;
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
        ProductJpa product = ProductJpa.create(domainEntity);
        repository.save(product);
    }

    @Override
    public void update(Product domainEntity) {

    }

    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public Product find(String id) {
        return repository
                .findById(id)
                .map(ProductJpa::toDomain)
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
                .map(ProductJpa::toDomain)
                .toList();
    }
}
