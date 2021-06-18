package portal.api.webflux.portalAPI.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRandomdata2 is a Querydsl query type for Randomdata2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRandomdata2 extends EntityPathBase<Randomdata2> {

    private static final long serialVersionUID = 1448952001L;

    public static final QRandomdata2 randomdata2 = new QRandomdata2("randomdata2");

    public final NumberPath<Integer> data1 = createNumber("data1", Integer.class);

    public final NumberPath<Integer> data2 = createNumber("data2", Integer.class);

    public final NumberPath<Integer> idx = createNumber("idx", Integer.class);

    public QRandomdata2(String variable) {
        super(Randomdata2.class, forVariable(variable));
    }

    public QRandomdata2(Path<? extends Randomdata2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRandomdata2(PathMetadata metadata) {
        super(Randomdata2.class, metadata);
    }

}

