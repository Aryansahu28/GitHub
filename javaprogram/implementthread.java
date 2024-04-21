class NewThread implements Runnable {
    Thread t;

    NewThread() {
        Thread t = new Thread(this, "Demo thread");
        System.out.println("Child Thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

public class implementthread {
public static void main(String args[]){
    new NewThread();
    try{
        for(int i = 5;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        System.out.println(e);
    }
}
}
