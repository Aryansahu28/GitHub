import java.util.Scanner;

public class ass_b_9 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the two numbers : ");
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
        if(y==1){
            System.out.println("Given numbers are relatively prime");
        }
        else{
            System.out.println("No they are not");
        }
    }
}
