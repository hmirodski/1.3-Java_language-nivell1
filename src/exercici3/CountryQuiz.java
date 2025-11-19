package exercici3;

import java.util.*;

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

    public void playRound(Scanner scanner) {
        for (int i = 1; i <= 10; i++) {
            String country = getRandomCountry();

            System.out.print("What's the capital of " + country + "? ");
            String capital = scanner.nextLine();

            if(correctAnswer(country,capital)){
                System.out.println("Correct!, the capital of "+ country + " is " + capital);
            } else {
                System.out.println("Wrong!, the capital of "+ country + " is " + getCapital(country));
            }
        }
    }

}
