package somejavafile;
public class subecxception {
    public static void main(String args[]){
        try{
            int a = 40;
            int b =0;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception :" + e);
        }
        // catch(ArithmeticException f){

        // }
    }   
}
