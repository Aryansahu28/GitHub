class A extends Thread{
    public static void Yield(){
        B t2 = new B();
        t2.start();
    }
    public void run(){
        for(int i =0 ;i<5;i++){
            if(i == 2) {
                B t2 = new B()
                try{
                    t2.join();
                }
                catch(Exception e){}
                Yield();}
            System.out.println("Thread A : "+i);
            
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Thread B : "+i);
        }
    }
}
public class Yield {
    public static void main(String args[]){
        A t1 = new A();
        t1.start();
        B t2 = new B();
        // t2.start();
    }
}
