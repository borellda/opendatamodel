package de.borellda.logic;

import de.borellda.domain.base.CoreEntity;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by borellda on 5/26/2016.
 */
public class PluginOption {
    /* The Logger */
    private static final Logger log = LoggerFactory.getLogger(PluginOption.class);

    public void getPluginInterface(){
        Reflections reflections = new Reflections("de.borellda.domain");
        Set<Class<? extends CoreEntity>> subTypes =
                reflections.getSubTypesOf(CoreEntity.class);

        for (Class<? extends CoreEntity> obj:subTypes) {
            try {
                CoreEntity tmp = obj.newInstance();
            } catch (InstantiationException e) {
                log.error(e.getMessage(), e);
            } catch (IllegalAccessException e) {
                log.error(e.getMessage(), e);
            }
        }


    }



}
