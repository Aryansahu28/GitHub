// Program to check whether a integer n is power of n or not and write program first 50 power of number 2

import java.util.Scanner;

public class ass_a_7 {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check whether it is power of two or not");
    int n = sc.nextInt();
    int t = n;
    boolean a = true;
    while(a){
        n = n%2;
        if(n==0){
            System.out.println(t+" is the power of 2");
            a = false;
            break;
        }    
        else if(n==1){
            System.out.println("It is not power of 2");
            break;
        }  
    }
    
    }
 }   
