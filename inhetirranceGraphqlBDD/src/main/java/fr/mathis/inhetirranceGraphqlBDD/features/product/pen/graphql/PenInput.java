package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.graphql;

import fr.mathis.inhetirranceGraphqlBDD.features.product.core.graphql.ProductDTO;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PenInput extends ProductDTO {
    private final String color;

    @Builder
    public PenInput(String name, String color) {
        super(name);
        this.color = color;
    }
}
