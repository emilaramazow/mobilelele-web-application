package bg.softuni.mobilelele.user;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {

    // this bean will be unique in current user session !!! (@SessionScope)
    // it is different for every user session

    private String name;
    private boolean loggedIn;

    public String getName() {
        return name;
    }

    public CurrentUser setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }

    public void clear() {
        loggedIn = false;
        name = null;
    }

    public boolean isAnonymous() {
        return !isLoggedIn();
    }

}
