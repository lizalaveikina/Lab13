package ucu.edu.ua.task1;

import java.time.LocalDate;

public class TwitterWrapper implements User {

    public TwitterWrapper(TwitterUser User){

        this.User = User;
        
    }


    private TwitterUser User;

    @Override

    public String getCountry(){

        return User.getCountry();

    }

    @Override

    public String getEmail(){

        return User.getEmail();

    }

    @Override

    public LocalDate getLastActiveTime(){

        return User.getUserActiveTime();

    }
}