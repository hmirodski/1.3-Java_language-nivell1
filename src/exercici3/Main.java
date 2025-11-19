package exercici3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "countries.txt";


        Countries countries = new Countries();
        Map<String,String> countryList = countries.loadCountries(filePath);
        System.out.println("this is countryList:  " + countryList);
        System.out.println("Countries loaded: " + countryList.size());

/*


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();


        List<String> keys = new ArrayList<>(countries.keySet());
        Random random = new Random();
        int points = 0;

        for (int i = 1; i <= 10; i++) {
            String randomCountry= keys.get(random.nextInt(keys.size()));
            String capital = countries.get(randomCountry);
            System.out.println("What's the capital of " + randomCountry);
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase(capital)) {
                System.out.println("Capital is " + capital);
                points++;
            } else {
                System.out.println("Incorrect: The capital is " + capital);
            }

        }
        System.out.println("Congrats " + username +  " you have " + points + " points");



*/

    }
}
