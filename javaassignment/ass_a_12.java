import java.util.Scanner;
public class ass_a_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y = y-x;
            }
        }
        System.out.println("GCD of x and y : "+y);

    }
}
