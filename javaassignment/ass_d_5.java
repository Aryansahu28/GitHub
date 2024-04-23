public class ass_d_5 {
    static int sum_digits(int n,int k){
        
        if(k==0){
            int r = n%10;
            return r;
        }
        k=k+1;
        int a = 0;
        while(k>0){
            int r = n%10;
            a = a+r;
            n = n/10;
            k=k-1;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 56789;
        System.out.println(sum_digits(n, 0));
        System.out.println(sum_digits(n, 2));
    }
}
