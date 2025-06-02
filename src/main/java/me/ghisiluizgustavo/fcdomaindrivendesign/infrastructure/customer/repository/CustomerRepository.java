package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.customer.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.customer.entity.Customer;
import me.ghisiluizgustavo.fcdomaindrivendesign.domain.customer.repository.CustomerRepositoryInterface;
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
