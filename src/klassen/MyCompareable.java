package klassen;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 12.02.2018 2018
 */
public class MyCompareable implements Comparable<MyCompareable > {
    int a;
    int b;
    public MyCompareable(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int compareTo(MyCompareable o) {
        return this.a - o.a;
    }
}
