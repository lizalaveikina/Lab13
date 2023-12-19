package ucu.edu.ua.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PDLReader {
    private String apiKey;

    public PDLReader(String apiKey) {
        this.apiKey = apiKey;
    }

    public JSONObject getCompanyInformation(String website) throws IOException {
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + website);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", apiKey);
        connection.connect();

        String text = new Scanner(connection.getInputStream(), StandardCharsets.UTF_8).useDelimiter("\\A").next();
        return new JSONObject(text);
    }
}

