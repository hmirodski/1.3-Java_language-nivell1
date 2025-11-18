package exercici3;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> countries = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("countries.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }  catch (IOException e) {
            System.out.println(e);
        }


    }
}
