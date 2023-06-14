package fr.mathis.inhetirranceGraphqlBDD.features.product.pen.graphql;

import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.domain.Pen;
import fr.mathis.inhetirranceGraphqlBDD.features.product.pen.service.PenService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PenMutationController {
    private final PenService penService;

    public PenMutationController(PenService penService) {
        this.penService = penService;
    }

    /**
     * Create a pen method graphql
     * @param penInput
     * @return
     */
    @MutationMapping
    public Pen createPen(@Argument PenInput penInput) {
        return this.penService.createPen(penInput.getName(), penInput.getColor());
    }


}
