import java.util.Scanner;

public class ass_a_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int a1=sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        double num = a1*a2*a3*a4;
        System.out.println("Multiply of four numbers is "+ a1*a2*a3*a4);
        System.out.println("Geometric mean of those numbers is " + Math.pow(num,4));
    }
}
