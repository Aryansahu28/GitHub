import java.util.Scanner;
class fact_do_while{
    void fact(int x){
        if(x==0){
            System.out.println("The factorial of 0 is 1");
        }
        else if(x>=1)
        {int j=1;
        int i=1;
        do{j=i*j;
            i=i+1;}
        while(i<=x);
    System.out.println("The factorial of "+x+" is "+ j);
}
    }
}
class fact_while_loop{
    void fact(int x){
        if(x==0){
            System.out.println("The factorial of 0 is 1");
        }
        else if(x>=1){
            int j=1;
            int i=1;
            while(i<=x){
                j=i*j;
                i=i+1;
            }
            System.out.println("The factorial of "+x+" is " +j);
        }
    }
}
class factorial_for_loop{
    void fact(int x){
        if(x==0){
            System.out.println("Factorial of 0 is 1");
        }
        else if(x>=1){
            int j=1;
            for(int i = 1;i<=x;i++){
                j=i*j;
            }
            System.out.println(j);
        }
        else{
            System.out.println("You enter the wrong number");
        }
    }
}
public class ass_a_14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial :");
        int x = sc.nextInt();
        fact_while_loop fc1 = new fact_while_loop();
        fc1.fact(x);
        fact_do_while fc2 = new fact_do_while();
        fc2.fact(x);
       

    }
}
