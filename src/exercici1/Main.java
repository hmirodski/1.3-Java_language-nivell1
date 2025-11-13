package exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> Months = new ArrayList<>();

        Months.add(new Month("January"));
        Months.add(new Month("February"));
        Months.add(new Month("March"));
        Months.add(new Month("April"));
        Months.add(new Month("May"));
        Months.add(new Month("June"));
        Months.add(new Month("July"));
        Months.add(new Month("September"));
        Months.add(new Month("October"));
        Months.add(new Month("November"));
        Months.add(new Month("December"));
        Months.add(new Month("December"));

        /*for (Month month : Months) {
            System.out.println(month.getName());
        }*/

        Months.add(7,new Month("August"));

        /*for (Month month : Months) {
            System.out.println(month.getName());
        }*/

        Set<Month> set = new HashSet<>(Months);

        for (Month month : set) {
            System.out.println(month.getName());
        }

        Iterator<Month> iterator = set.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.getName());
        }

    }
}
