package exercici3;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> countries = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("countries.txt"));
            String line;
            line = reader.readLine();
            

        }  catch (IOException e) {
            System.out.println(e);
        }


    }
}
