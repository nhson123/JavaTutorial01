package klassen;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 30.01.2018 2018
 */
public class Convertible extends Notebook {
    public Convertible(String derProcesser, String dieGraficCard, int derRam, int derPrice, int dasGewicht, boolean b) {
        super(derProcesser, dieGraficCard, derRam, derPrice, dasGewicht,true);
    }
    @Override
    public String datenBlatt(){
        String daten = "Processor: "+processor+"\n Grafic: " +graficCard+"\n Ram: "+ram +"\n Price:"+ price +"\n Weight: "+ weight+"\n Convertible: ja";
        return daten;
    }
}
