package klassen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 12.02.2018 2018
 */
public class HashSets {
    public void hashSetAusgabe(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hallo");
        hashSet.add("Hallo");
        hashSet.add("hallo");
        Collection<String> c = new ArrayList<String>();
        c.add("so mot");
        c.add("so hai");
        hashSet.addAll(c);
        Iterator<String> i = hashSet.iterator();
        System.out.println(hashSet.contains("Hallo"));
        while (i.hasNext()){
            System.out.println("HashSets iterator: "+i.next());
        }
    }

}
