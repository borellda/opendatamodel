package de.borellda.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/**
 * Created by borellda on 4/18/2016.
 */
public class PropertyStore {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PropertyStore.class);

    private Map<String, String> map = new HashMap<>();

    public Optional<String> getProperty(String propertyName) {
        return Optional.ofNullable(map.get(propertyName));
    }

    public <T> Optional<T> getProperty(String propertyName, Function<String,? extends T> func ) {
        return getProperty(propertyName).map(val -> {
            try {
                return func.apply( val );
            } catch ( Exception e ) {
                log.error( String.format("Invalid property transform, will default %s" , e.getMessage()),e );
                return null;
            }
        });
    }

}
