package klassen;

import java.io.File;
import java.util.Scanner;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 31.01.2018 2018
 */


public class Fehlerbehandlung {
    public String lesen(String url) {

        String text = "";
        try {
            File datei = new File(url);
            Scanner sc = new Scanner(datei);
            while (sc.hasNextLine()) {
                text = text + sc.nextLine() + "\n";
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Datein nicht gefunden!");
        }

        return text;
    }

    public void printDatei(String text) {
        System.out.println("Ausgabe aus: " + getClass().getName());
        System.out.println(text);
    }
}