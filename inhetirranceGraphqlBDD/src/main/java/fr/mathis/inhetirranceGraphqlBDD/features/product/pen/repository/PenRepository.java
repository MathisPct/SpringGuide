package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.repository;

import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.domain.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepository extends JpaRepository<Pen, Long> {
}
