package klassen;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 09.02.2018 2018
 */
public class ZwischenAblage {
    public void zwichenAblageAusgeben(){
        Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
        sysClip.setContents(new StringSelection("der Zwischenablage"),null);
        Transferable transfer = sysClip.getContents(null);
        for(int i = 0; i< transfer.getTransferDataFlavors().length; i++){
            Object content = null;
            try {
                content = transfer.getTransferData(transfer.getTransferDataFlavors()[i]);
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(content instanceof String){
                System.out.println(content);
                break;

            }
        }
    }
}
