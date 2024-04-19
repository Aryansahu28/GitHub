public class ass_a_11 {
    public static void main(String args[]){
        int x = 2%2+2*2-2/2;
        System.out.println(x);
        int a=4,b=5,c=6;
        boolean y = (((a<b))||(b>c))&&((a>b)||(!(a>c)));
        System.out.println(y);
        int i=8,j=5;
        double k=0.005,l=-0.01;
        double ans = 5*((i/7)+(j*(i-3))%(k+l-2+i));
        System.out.println(ans);
        int d = 10;
        int t = --d;
        int z = d--;
        int m = t*z;
    }
}
