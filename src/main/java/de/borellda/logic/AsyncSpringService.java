package de.borellda.logic;

import de.borellda.domain.PackageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by borellda on 4/18/2016.
 */
@Service
public class AsyncSpringService {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(AsyncSpringService.class);

    @Async
    public <R>Future execute(Runnable obj){

        obj.run();
        R result = (R) "GOOD";
        return new AsyncResult<>(result);
    }
}
