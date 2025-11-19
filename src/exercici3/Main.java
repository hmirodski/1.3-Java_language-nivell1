package exercici3;

import java.io.*;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "countries.txt";


        CountriesList countries = new CountriesList();
        Map<String,String> countryList = countries.loadCountries(filePath);
        System.out.println("this is countryList:  " + countryList);
        System.out.println("Countries loaded: " + countryList.size());



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();


        CountryQuiz game = new CountryQuiz(countryList);
        for (int i = 1; i <= 10; i++) {
            String country = game.getRandomCountry();

            System.out.print("What's the capital of " + country + "? ");
            String capital = scanner.nextLine();

            if(game.correctAnswer(country,capital)){
                System.out.println("Correct!, the capital of "+ country + "is " + capital);
            } else {
                System.out.println("Wrong!, the capital of "+ country + "is " + capital);
            }
        }


            System.out.println("Congrats " + username +  " you have " + points + " points");




    }
}
