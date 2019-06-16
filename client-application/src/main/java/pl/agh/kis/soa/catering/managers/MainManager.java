package pl.agh.kis.soa.catering.managers;

import lombok.Getter;
import lombok.Setter;
import pl.agh.kis.soa.catering.model.User;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Singleton
@Startup
public class MainManager implements Serializable {

    private List<User> loggedUsers;

    @PostConstruct
    public void setupApplication() {
        this.loggedUsers = new ArrayList<User>();
    }

    public List<User> getLoggedUsers() {
        return loggedUsers;
    }

    public void setLoggedUsers(List<User> loggedUsers) {
        this.loggedUsers = loggedUsers;
    }

}