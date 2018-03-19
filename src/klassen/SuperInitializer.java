package klassen;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 05.02.2018 2018
 */
public class SuperInitializer {
    int i = 2;

    static {

        System.out.println("SuperInitializer Static");
    }

    {
        System.out.println("SuperInitializer instance initializer");
        i = 3;
        foo();
    }

    public SuperInitializer() {
        System.out.println("SuperInitializer constructor");
    }

    public SuperInitializer(int i) {
        System.out.println("SuperInitializer constructor " + i);
    }

    private void foo() {  //public oder private
        System.out.println("SuperMethode Foo! " + i);
    }

    final void fixMethode() {
        try {
            System.out.println(getClass().getMethod("fixMethode".toString()) + " in SuperIni");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}