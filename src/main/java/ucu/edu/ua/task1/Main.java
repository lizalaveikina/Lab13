package ucu.edu.ua.task1;

public class Main {

    public User login(String logIn) {

        if (logIn.equals("facebook")) {
            return new FacebookWrapper(new FacebookUser());
        } 
        
        else if (logIn.equals("twitter")) {
            return new TwitterWrapper(new TwitterUser());
        }

        return null;
    }
}