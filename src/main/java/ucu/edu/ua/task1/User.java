package ucu.edu.ua.task1;

import java.time.LocalDate;

public interface User {

    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();

}