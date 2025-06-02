package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.customer.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.customer.model.CustomerJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCustomerRepository extends JpaRepository<CustomerJpa, String> { }
