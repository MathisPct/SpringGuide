package fr.mathis.inhetirranceGraphqlBDD.features.product.core.service;

import fr.mathis.inhetirranceGraphqlBDD.features.product.core.domain.Product;
import fr.mathis.inhetirranceGraphqlBDD.features.product.core.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> allProduct() {
        List<Product> all = productRepository.findAll();
        return all;
    }
}
