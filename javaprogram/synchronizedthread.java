class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Interrrupted Thread");
        }
        System.out.print("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    public Caller (Callme c,String s){
        target = c;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}
public class synchronizedthread {
    public static void main(String args[]){
        Callme ct = new Callme();
        Caller c1 = new Caller(ct,"Hello");
        Caller c2 = new Caller(ct,"Synchronized");
        Caller c3 = new Caller(ct,"World");
    try{
        c1.t.join();
        c2.t.join();
        c3.t.join();
    }catch(InterruptedException e){
        System.out.println("Interrupted Exception");
    }
    }
}
