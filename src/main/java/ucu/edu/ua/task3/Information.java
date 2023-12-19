package ucu.edu.ua.task3;

import org.json.JSONObject;

import java.io.IOException;

public class Information {

    private PDLReader pdlReader;
    private WikiReader wikipediaReader;

    public Information(String pdlApiKey, String wikipediaUrl) {

        this.pdlReader = new PDLReader(wikipediaUrl);

        this.wikipediaReader = new WikiReader(wikipediaUrl);
    }

    public JSONObject getCompanyInformation(String website) {

        try {
            JSONObject pdlInfo = pdlReader.getCompanyInformation(website);
            String companyName = wikipediaReader.getCompanyName();
            String description = wikipediaReader.getDescription();
            String logoUrl = wikipediaReader.getLogoUrl();

            JSONObject companyInfo = new JSONObject();
            companyInfo.put("pdlInfo", pdlInfo);
            companyInfo.put("companyName", companyName);
            companyInfo.put("description", description);
            companyInfo.put("logoUrl", logoUrl);

            return companyInfo;
        } 
        
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String pdlApiKey = "YOUR_PDL_API_KEY";
        String wikipediaUrl = "https://en.wikipedia.org/wiki/Your_Company_Name";
        String website = "ucu.edu.ua";

        Information facade = new Information(pdlApiKey, wikipediaUrl);
        JSONObject companyInformation = facade.getCompanyInformation(website);

        if (companyInformation != null) {
            System.out.println(companyInformation);
        } else {
            System.out.println("Failed to retrieve company information.");
        }
    }
}

