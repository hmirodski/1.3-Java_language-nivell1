package exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public Map<String,String> loadCountries(String filepath) {

        Map<String,String> countries = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                countries.put(split[0],split[1]);

            }
            br.close();
        }  catch (IOException e) {
            System.out.println("Error loading countries: " + e.getMessage());
        }
        return countries;
    };

}
