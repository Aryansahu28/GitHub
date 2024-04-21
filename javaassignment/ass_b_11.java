import java.util.Scanner;

public class ass_b_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for fibonacci series or Hemchandra Series : ");
        int n = sc.nextInt();
        int b=1,c,a=0;
        if(n==0){
            System.out.print(n);
        }
        else if(n>=1){
            for(int i=2;i<=n;i++){
                c = a + b ;
                a = b;
                b =c;
                System.out.print(b+", ");
            }
        }
    }
}
