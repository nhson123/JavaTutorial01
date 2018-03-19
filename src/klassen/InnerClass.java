package klassen;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 05.02.2018 2018
 */
public class InnerClass {
    private int x;
    private static int y =10;
    public void print(){
        Inner inner = new Inner();
        inner.innerPrint();
    }

    private static class Inner{
        int z = y;
        private static int j = 1;
        private void innerPrint(){
                System.out.println(" Call: "+ z+j);

        }
    }

    public class NestedClass{
        public void nestedY(){
            y++;
            System.out.println("nestedClass:"+y);
        }
    }
}
