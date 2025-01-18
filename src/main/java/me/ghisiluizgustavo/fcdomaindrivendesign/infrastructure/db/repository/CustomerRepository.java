package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Customer;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.repository.CustomerRepositoryInterface;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.repository.ProductRepositoryInterface;
import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model.ProductJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepositoryInterface {

    private final JpaCustomerRepository repository;

    public CustomerRepository(JpaCustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Customer entity) {
        
    }

    @Override
    public void update(Customer entity) {

    }

    @Override
    public Customer find(String id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }
}
