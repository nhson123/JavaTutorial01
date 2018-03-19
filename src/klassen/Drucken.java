package klassen;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 09.02.2018 2018
 */
public class Drucken {
    public void printerJob() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(new PrintObject());

        if(printerJob.printDialog()){
            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }

}
