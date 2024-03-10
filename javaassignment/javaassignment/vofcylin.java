package javaassignment;

import java.util.Scanner;

public class vofcylin {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter height of Cylinder");
            //height of cylinder
            int h = sc.nextInt();
            System.out.println("Enter radius of Cylinder");
            int r = sc.nextInt();
            double V = (double)3.14*r*r*h;
            System.out.print("Volume of Cylinder is "+ V);
        }
    }
}