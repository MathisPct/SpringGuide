package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.graphql;

import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.domain.Pen;
import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.service.PenService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PenQueryController {
    private final PenService penService;

    public PenQueryController(PenService penService) {
        this.penService = penService;
    }

    @QueryMapping
    public Pen getPenById(@Argument long id) {
        return this.penService.getPenById(id);
    }

    @QueryMapping
    public List<Pen> allPens() {
        return this.penService.allPen();
    }
}
