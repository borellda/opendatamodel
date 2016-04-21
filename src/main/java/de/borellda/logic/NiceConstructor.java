package de.borellda.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by borellda on 4/20/2016.
 */
public class NiceConstructor {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(NiceConstructor.class);

    private final static Runnable DEFAULTRUNNABLE = ()->{};

    private Runnable runner;

    public NiceConstructor(){
        this(DEFAULTRUNNABLE);
    }

    public NiceConstructor(Runnable run){
        this.runner = run;
    }

}
