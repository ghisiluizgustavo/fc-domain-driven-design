package me.ghisiluizgustavo.fcdomaindrivendesign.infrastructure.db.model;

import me.ghisiluizgustavo.fcdomaindrivendesign.domain.entity.Product;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductJpa {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    private String name;
    private double price;

    public ProductJpa() {
    }

    public ProductJpa(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static ProductJpa create(Product domainEntity) {
        return new ProductJpa(
                domainEntity.getId(),
                domainEntity.getName(),
                domainEntity.getPrice()
        );
    }

    public Product toDomain(){
        return new Product(
                this.id,
                this.name,
                this.price
        );
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
