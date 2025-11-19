package exercici3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Load countries to hashmap
        HashMap<String,String> countries = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("countries.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                countries.put(split[0],split[1]);

            }
            br.close();
        }  catch (IOException e) {
            System.out.println("IOException");
        }


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

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("clasificacio.txt", true));
            bw.write(username + ": " + points + " points");
            bw.newLine();
            bw.close();
            System.out.println("clasificacio.txt saved successfully");
            scanner.close();
        } catch (IOException e) {
            System.out.println("classificacio.txt not saved");
        }


    }
}
