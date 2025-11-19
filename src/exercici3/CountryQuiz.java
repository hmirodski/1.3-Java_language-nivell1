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

    public boolean correctAnswer(String country, String answer) {
        String correctCapital = getCapital(country);
        boolean correct = correctCapital.equalsIgnoreCase(answer);

        if(correct) {
            points++;
        }
        return correct;

    }
}
