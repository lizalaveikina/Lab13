package ucu.edu.ua.task1;

import java.time.LocalDate;

public class FacebookWrapper implements User{

    public FacebookWrapper(FacebookUser User) {

        this.User = User;
    }

    private FacebookUser User;

    @Override

    public String getCountry() {

        return User.getUserCountry();

    }

    @Override

    public String getEmail() {

        return User.getEmail();

    }

    @Override

    public LocalDate getLastActiveTime() {

        return User.getUserActiveTime();

    }

}
