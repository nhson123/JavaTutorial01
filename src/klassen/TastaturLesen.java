package klassen;

import java.util.Scanner;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 30.01.2018 2018
 */
public class TastaturLesen {
    public TastaturLesen() {

    }

    String[] eingaben = new String[3];

    public String[] einlesen() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < eingaben.length; i++) {
            eingaben[i] = sc.nextLine();
        }
        sc.close();
        return eingaben;
    }

    public void printEingaben(String[] text) {
        System.out.println("Ausgabe aus: " + getClass().getName());
        for (String i : text) {
            System.out.println(i);

        }
    }

}

