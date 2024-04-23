// Write and test a method to print all the factorial numbers upto an input limit: (for e.g if
// the input is 6, your program should print 1, 1, 2, 6, 24, 120, 720).
public class ass_d_4 {
    static void factorial(int n){
        if(n==0){
            System.out.print(1);
        }
        else if(n>0){
            int a = 1;
            for(int i=1;i<=n;i++){
                a = a*i;
            }
            System.out.print(", "+a);
        }
        else{
            System.out.println("Enter the correct value");
        }
    }
    public static void main(String[] args) {
        int n =8;
        for(int i=0;i<=n;i++){
            factorial(i);
        }
    }
}
