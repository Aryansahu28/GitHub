import java.util.Scanner;

public class ass_b_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int s = sc.nextInt();
        if(s>=11){
            while(s>1){
                if(s%2==0){
                    s=s/2;
                    System.out.println(s);
                }
                else if (s==1){
                    System.out.println(1);
                    break;
                }
                else{
                    s = s*3+1;
                    System.out.println(s);
                }
            }
        }
    }
}
