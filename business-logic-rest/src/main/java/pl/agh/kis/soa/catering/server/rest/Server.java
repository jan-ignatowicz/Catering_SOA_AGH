package pl.agh.kis.soa.catering.server.rest;

import pl.agh.kis.soa.catering.server.rest.services.CategoryService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("api")
public class Server extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();

        classes.add(CategoryService.class);

        return classes;
    }

}
