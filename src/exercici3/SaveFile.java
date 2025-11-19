package exercici3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public boolean save(String filename, String username, int points){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
            bw.write(username + "scored: " + points + " points");
            bw.newLine();
            bw.close();
            System.out.println("clasificacio.txt saved successfully");
            return true;

        } catch (IOException e) {
            System.out.println("classificacio.txt not saved");
            return false;
        }

    }

}
