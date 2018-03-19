package klassen;

import org.codehaus.groovy.runtime.powerassert.SourceText;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Properties;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 01.03.2018 2018
 */
public class Propertieses {
    Properties pros = null;
    OutputStream outputStream;

    public Propertieses() {
        pros = new Properties();
    }
    public void ProsWrite(){

        try {
            outputStream = new FileOutputStream("dataconfig.properties");
            //throw new EmptyStackException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pros.setProperty("Marke", "Aquarist");
        pros.setProperty("RAM", "3");
        pros.setProperty("CPU", "2GB");
        try {
            pros.store(outputStream,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ProsRead(){
        try {
            pros = new Properties();
            InputStream inputStream = new FileInputStream("dataconfig.properties");
            pros.load(inputStream);
            System.out.println(getClass().getMethod("ProsRead")+" GetProperties of Mainboard: "+pros.getProperty("Mainboard"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
