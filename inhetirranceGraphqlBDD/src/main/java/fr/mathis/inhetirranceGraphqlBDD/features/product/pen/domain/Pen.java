package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.domain;

import fr.mathis.inhetirranceGraphqlBDD.features.product.core.domain.Product;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Pen extends Product {
    private String color;

    public Pen(String name, String color) {
        super(name);
        this.color = color;
    }

    protected Pen() {

    }
}
