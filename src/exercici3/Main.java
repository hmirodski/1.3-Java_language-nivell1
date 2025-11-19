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
        game.playRound(scanner);
        System.out.println(username + " You scored " + game.getPoints() + "/10 points");

        SaveFile saver = new SaveFile();
        if (saver.save("clasificacio.txt", username, game.getPoints())) {
            System.out.println("clasificacio.txt saved successfully");
        } else {
            System.out.println("classificacio.txt not saved");
        }

    }
}
