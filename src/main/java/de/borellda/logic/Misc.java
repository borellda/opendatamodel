package de.borellda.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by borellda on 4/18/2016.
 */
public class Misc {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(Misc.class);

    private AsyncSpringService service;

    private PropertyStore store;

    private Properties prop;

    public void codeExample(){

        int size = store.getProperty("pool.limit", Integer::parseInt).orElse(200);
        //------old style----- on every cast---
        String pool = prop.getProperty("pool.limit");
        size = 200;
        if (null != pool){
            try {
                size = Integer.parseInt(pool);
            }catch (Exception e){
                log.error(e.getMessage(), e);
            }
        }


        boolean enabled = store.getProperty("cache.enabled", Boolean::getBoolean).orElse(true);


        Runnable run = this::doAnything;

        Future<?> execute = service.execute(run);

        try {
            log.info((String) execute.get());
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        } catch (ExecutionException e) {
            log.error(e.getMessage(), e);
        }

    }


    public void doAnything(){

        log.info("This is a long running job that can be put to the background");

    }

}
