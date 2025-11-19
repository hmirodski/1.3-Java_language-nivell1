package exercici3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CountryQuiz {



    List<String> keys = new ArrayList<>(countryList.keySet());
    Random random = new Random();
    int points = 0;

        for (int i = 1; i <= 10; i++) {
        String randomCountry= keys.get(random.nextInt(keys.size()));
        String capital = countryList.get(randomCountry);
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
