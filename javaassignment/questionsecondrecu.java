public class questionsecondrecu {
    public static void main(String[] args){
        q2(5);
    }
    public static void q2(int n){
        if(n==0){
            return;
        }
        q2(n-1);
        System.out.println(n);
    }
}
