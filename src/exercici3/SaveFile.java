package exercici3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public void save(String filename, String username, int Points){

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
