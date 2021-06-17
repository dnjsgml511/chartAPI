package portal.api.webflux.portalAPI.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRandomdata1 is a Querydsl query type for Randomdata1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRandomdata1 extends EntityPathBase<Randomdata1> {

    private static final long serialVersionUID = 1448952000L;

    public static final QRandomdata1 randomdata1 = new QRandomdata1("randomdata1");

    public final NumberPath<Integer> data1 = createNumber("data1", Integer.class);

    public final NumberPath<Integer> data2 = createNumber("data2", Integer.class);

    public final NumberPath<Integer> idx = createNumber("idx", Integer.class);

    public QRandomdata1(String variable) {
        super(Randomdata1.class, forVariable(variable));
    }

    public QRandomdata1(Path<? extends Randomdata1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRandomdata1(PathMetadata metadata) {
        super(Randomdata1.class, metadata);
    }

}

