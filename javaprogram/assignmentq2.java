import java.util.Scanner;
import java.math.*;

public class assignmentq2 {
    public static void main(String[] a){
        System.out.print("Choose:\n 1 for circle\n 2 for square\n 3 for rectangle: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x==1){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the radius of circle");
            int r = sc1.nextInt();
            assignmentq2 assg = new assignmentq2();
            assg.circle(r);
        }

    }
    public static void circle(int r){
        System.out.println(r*r*3.14);
    }
}
