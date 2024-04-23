public class ass_d_6 {
    static boolean isdigitpresent(int d, int n){
        while(n>0){
            int r = n%10;
            if(r==d){
                return true;
            }
            n=n/10;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isdigitpresent(5, 1234678));
    }
}
