package de.borellda.logic;

import de.borellda.domain.base.CoreEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

/**
 * Created by borellda on 5/31/2016.
 */
public class FluentThreadsafeBuilder {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(FluentThreadsafeBuilder.class);


    private Function<Product, Product> fn;

    public FluentThreadsafeBuilder begin() {
        fn = (ignored) -> { return new Product(); };
        return this;
    }

    public FluentThreadsafeBuilder engine() {
        fn = fn.andThen((product) -> {
            product.parts.add("Engine");
            return product;
        });
        return this;
    }

    public FluentThreadsafeBuilder steeringWheel() {
        fn = fn.andThen((product) -> {
            product.parts.add("Steering Wheel");
            return product;
        });
        return this;
    }

    public FluentThreadsafeBuilder tire(int numberOfTires) {
        fn = fn.andThen((product) -> {
            for (int i=0; i<numberOfTires; i++)
                product.parts.add("Tire");
            return product;
        });
        return this;
    }

    public Product end() {
        return fn.apply(null);
    }



}
