import java.util.Scanner;

public class ass_b_5 {
    void add(int x,int y){
        int z = x+y;
        System.out.println(z);
    }
    void sub(int x,int y){
        System.out.println(x-y);
    }
    void div(int x, int y){
        System.out.println(x/y);
    }
    void mul(int x,int y){
        System.out.println(x*y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        ass_b_5 as = new ass_b_5();
        as.sub(x, y);
    }
}
