package ru.practicum.event.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;

import javax.annotation.processing.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QqLocation extends EntityPathBase<Location> {

    private static final long serialVersionUID = 1516074437L;

    public static final QqLocation location = new QqLocation("location");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Float> lat = createNumber("lat", Float.class);

    public final NumberPath<Float> lon = createNumber("lon", Float.class);

    public QqLocation(String variable) {
        super(Location.class, forVariable(variable));
    }

    public QqLocation(Path<? extends Location> path) {
        super(path.getType(), path.getMetadata());
    }

    public QqLocation(PathMetadata metadata) {
        super(Location.class, metadata);
    }

}