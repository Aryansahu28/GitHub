public class gcd_num {
    public static void main(String[] args){
        int a = 4;
        int b =18;
        System.out.println(gcd(a,b));
    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
