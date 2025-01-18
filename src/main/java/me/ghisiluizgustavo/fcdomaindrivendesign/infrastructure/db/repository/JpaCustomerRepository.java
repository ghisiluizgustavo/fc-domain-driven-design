package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.repository;

import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model.CustomerJpa;
import me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model.ProductJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCustomerRepository extends JpaRepository<CustomerJpa, String> { }
