package exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista);

        List<Integer> segonaLista = new ArrayList<>();

        ListIterator<Integer> iterator = lista.listIterator(lista.size());
        while (iterator.hasPrevious()) {
            segonaLista.add(iterator.previous());
        }

        System.out.println(segonaLista);
    }
}
