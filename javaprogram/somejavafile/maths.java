package somejavafile;
import java.util.Scanner;

public class maths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        double x = l*l + h*h;
        double hypo = Math.sqrt(x);
        System.out.println(hypo);
    }
}