public class FactorialRecursion {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        else if(n>0){
            return n*Fact(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String a[]){
        
    }
}

