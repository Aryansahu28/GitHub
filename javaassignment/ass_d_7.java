public class ass_d_7 {
    static void printsquares(int power,int upperlimit){
        for(int i=1;i<=upperlimit;i++){
            if(i==1){
                System.out.print(1);
            }
            else{
                System.out.print(", "+((int)(Math.pow(i, power))));
            }
        }
    }
    public static void main(String[] args) {
        printsquares(3,7 );
    }
}
