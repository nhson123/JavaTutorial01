package klassen;

/**
 * Package: klassen
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 01.02.2018 2018
 */
public class unDeadLock {
    boolean flag = false;

    public synchronized void first(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getClass().getName()+" der Ersete");
        flag = true;
        notify();
    }

    public synchronized void second(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getClass().getName()+" der Zweiter");
        flag = false;
        notify();
    }
}