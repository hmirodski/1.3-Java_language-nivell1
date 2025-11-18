package exercici3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {

    public void read(){

        try {
            FileReader countries = new FileReader("acountries.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }

}
