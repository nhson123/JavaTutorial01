package mainPackage;

/**
 * Package: PACKAGE_NAME
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 29.01.2018 2018
 */
public class Rekursion {
    public void loop(int x){
        if(x>0) {
            System.out.println(" x ist: " + x);
            if(x==1)System.out.println(" Ende!");
            loop(x - 1);
        }
    }
}
