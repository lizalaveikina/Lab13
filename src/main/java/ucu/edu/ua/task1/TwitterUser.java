package ucu.edu.ua.task1;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data @ToString

public class TwitterUser {

    private String email;
    private String country;
    private LocalDate UserActiveTime;

}
