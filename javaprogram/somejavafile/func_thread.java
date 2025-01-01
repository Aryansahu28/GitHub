package somejavafile;
class Thread1 extends Thread{

    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(i + " Status: " + isAlive());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class func_thread {
    public static void main(String arg[]){

        Thread1 t = new Thread1();
        t.start();
        try{
            t.join();
        }catch(Exception e){
            System.out.println("e");
        }
        System.out.println("New Status : " + t.isAlive());
        
    }

}
