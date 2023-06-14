package fr.mathis.inhetirranceGraphqlBDD.features.product.core.graphql;

import fr.mathis.inhetirranceGraphqlBDD.features.product.core.domain.Product;
import fr.mathis.inhetirranceGraphqlBDD.features.product.core.service.ProductService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductQuery {
    private final ProductService productService;

    public ProductQuery(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<Product> allProducts() {
        return productService.allProduct();
    }
}
