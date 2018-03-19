package klassen.dateiHangling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 09.02.2018 2018
 */
public class TxTDateiSchreiben {
    public void fileWriter(String url) {
        FileWriter fileWriter;
        File file = new File(url);
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("ich bin der neue Zeile");
            fileWriter.write(System.getProperty("line.separator")); // write in new line
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}