package fr.mathis.inhetirranceGraphqlBDD.features.product.core.repository;

import fr.mathis.inhetirranceGraphqlBDD.features.product.core.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
