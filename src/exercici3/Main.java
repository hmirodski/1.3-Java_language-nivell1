package exercici3;

import java.io.*;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "countries.txt";


        CountriesList countries = new CountriesList();
        Map<String,String> countryList = countries.loadCountries(filePath);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();


        CountryQuiz game = new CountryQuiz(countryList);
        
        for (int i = 1; i <= 10; i++) {
            String country = game.getRandomCountry();

            System.out.print("What's the capital of " + country + "? ");
            String capital = scanner.nextLine();

            if(game.correctAnswer(country,capital)){
                System.out.println("Correct!, the capital of "+ country + " is " + capital);
            } else {
                System.out.println("Wrong!, the capital of "+ country + " is " + game.getCapital(country));
            }
        }
        System.out.println(username + " You scored " + game.getPoints() + "/10 points");


        SaveFile saver = new SaveFile();
        if (saver.save("clasificacio.txt", username, game.getPoints())) {
            System.out.println("Score saved successfully");
        } else {
            System.out.println(" Error saving score");
        }




    }
}
