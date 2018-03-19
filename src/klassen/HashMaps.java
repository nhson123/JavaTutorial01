package klassen;

import klassen.tiere.Hund;
import klassen.tiere.Katze;
import klassen.tiere.Tier;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 13.02.2018 2018
 */
public class HashMaps {
    public void hashMapOperation(){
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        hashMap.put("first",1.0001);
        hashMap.get("first");

        TreeMap<String,Tier> treeMap = new TreeMap<String, Tier>();
        treeMap.put("Hund", new Hund());
        treeMap.put("Katze", new Katze());
        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            Tier tier = (Tier) mapEntry.getValue();
            System.out.println("Aus Treemap: "+tier.getTierArt());
        }
    }
}
