package fr.mathis.inhetirranceGraphqlBDD.features.product.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Access(AccessType.FIELD)
@Getter
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String name;

    public Product(String name) {
        this.name = name;
    }
}
