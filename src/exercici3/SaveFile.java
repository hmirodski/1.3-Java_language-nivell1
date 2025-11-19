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

            return true;

        } catch (IOException e) {

            return false;
        }

    }

}
