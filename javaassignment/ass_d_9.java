public class ass_d_9 {
    static int f(int i){
        if(i==0) return 0;

            if(i%2==0){
                return f(i/2) + f(i/2);
            }
        else{return f(i-1) + 1;}

    }
    public static void main(String[] args) {
        System.out.println(f(11));
    }
}
