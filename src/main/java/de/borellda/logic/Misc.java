package de.borellda.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by borellda on 4/18/2016.
 */
public class Misc {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(Misc.class);

    private AsyncSpringService service;

    public void codeExample(){

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
