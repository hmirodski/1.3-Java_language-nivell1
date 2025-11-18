package exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> countries = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("countries.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                countries.put(split[0],split[1]);
            }

        }  catch (IOException e) {
            System.out.println("IOException");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String input = scanner.nextLine();

        int counter = 1;
        while( counter <= 10 ) {

            counter++;
        }





    }
}
