public class NestedRecursion {
    public static int funcA(int n){
        if(n>100){
           return n-1;
        }
        else{
            return funcA(funcA(n+11));
        }
    }
    public static void main(String arg[]){
        System.out.println(funcA(95));
    }
}
