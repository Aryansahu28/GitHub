import java.util.Scanner;

public class ass_c_1 {
    
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter no. "+(i+1)+" :");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter a number you want to search : ");
        int x = sc.nextInt();
        int flag =0;
        for(int i = 0; i<10;i++){
            if(a[i] == x){
                flag=flag+1;
            }
        }
        if(flag>=1)
            System.out.println("Your number has been found and it is repeated "+flag+" times");
        else 
            System.out.println("Your number has not been entered");
        
    }
}
