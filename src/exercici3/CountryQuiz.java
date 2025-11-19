package exercici3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CountryQuiz {

    private Map<String, String> countries;
    private List<String> keys;
    private Random random = new Random();
    private int points = 0;

    public CountryQuiz(Map<String, String> countries) {
        this.countries = countries;
        this.keys = new ArrayList<>(countries.keySet());
    }

    public String getRandomCountry() {
        return keys.get(random.nextInt(keys.size()));
    }

    public String getCapital(String country) {
        return countries.get(country);
    }

    public int getPoints() {
        return points;
    }

        for(int i = 1; i <= 10; i++) {

        
        System.out.println("What's the capital of " + randomCountry);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase(capital)) {
            System.out.println("Capital is " + capital);
            points++;
        } else {
            System.out.println("Incorrect: The capital is " + capital);
        }

    }
}
