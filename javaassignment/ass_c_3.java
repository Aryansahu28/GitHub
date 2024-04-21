import java.util.Scanner;

public class ass_c_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a[] = new double[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter no. "+(i+1));
            a[i] = sc.nextDouble();
        }
        double b[] = new double[10];
        int j = 9;
        for(int i=0;i<10;i++){
            b[j] = a[i];
            j=j-1;
        }
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
        System.out.println(" ");
        for(int i=0;i<10;i++)
            System.out.print(b[i]+" ");
        
    }
}
