package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.service;

import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.domain.Pen;
import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.repository.PenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenService {
    private final PenRepository penRepository;

    public PenService(PenRepository penRepository) {
        this.penRepository = penRepository;
    }

    public Pen createPen(String name, String color) {
        return penRepository.save(new Pen(name, color));
    }

    public Pen getPenById(long id) {
        return penRepository.findById(id).orElseThrow(() -> new RuntimeException("Pen not found"));
    }

    public List<Pen> allPen() {
        return penRepository.findAll();
    }
}
