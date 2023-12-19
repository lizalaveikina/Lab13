package ucu.edu.ua.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class WikiReader {
    private String url;

    public WikiReader(String url) {
        this.url = url;
    }

    public String getCompanyName() throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.title();
    }

    public String getDescription() throws IOException {
        Document document = Jsoup.connect(url).get();
        Element descriptionElement = document.select("#mp-upper").first();
        return (descriptionElement != null) ? descriptionElement.text() : "No description found";
    }

    public String getLogoUrl() throws IOException {
        Document document = Jsoup.connect(url).get();
        Element logoElement = document.select("img").first();
        return (logoElement != null) ? logoElement.absUrl("src") : null;
    }
}
