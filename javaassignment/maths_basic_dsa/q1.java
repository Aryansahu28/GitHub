package maths_basic_dsa;
public class q1 {
    public static void main(String[] args) {
        odd(2);
    }
    public static boolean odd(int n){
        if((n&1)==1){
            // System.out.println("It is odd");
            return true;
        }
        return false;
        
    }
}
