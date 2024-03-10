

//Write a JAVA program to find the multiplication of given 4 numbers. Also find their geometric mean.

import java.util.Scanner;

public class gp{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("When you enter the four number there will be there multiplication and Geometric Mean of them");
            // Thread.sleep(2000);
            System.out.println("Enter the four numbers");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            String a =String.format("Multipication of %d %d %d %d",n1,n2,n3,n4);
            System.out.print(a);
            System.out.print(" is "+ n1*n2*n3*n4);
            if (n2/n1 == n3/n2 && n3/n2 == n4/n3){
                int b = n1;
                int r = n2/n1;
                System.out.println("Geometric mean of that numbers are "+ b*(Math.pow(r,3)));
            }
            else{
                System.out.println("Numbers are not in Geometric Mean");
            }
        }
}

