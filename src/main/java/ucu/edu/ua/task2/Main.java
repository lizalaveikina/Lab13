package ucu.edu.ua.task2;

public class Main {
    public static void main(String[] args) {

        DataBase db = new DataBase();

        Authorization client = new Authorization();

        if (client.login(db)) {

            ReportBuilder builder = new ReportBuilder(db);

        }
    }
}