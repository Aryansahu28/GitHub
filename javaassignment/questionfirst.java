

public class questionfirst {
    public static void main(String[] args){
        q1(5);
    }

    public static void q1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        q1(n-1);
    }
}
