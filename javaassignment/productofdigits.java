public class productofdigits {
    
        public static void main(String[] args){
            int n = 1342;
            System.out.println(sod(n));
        }
        public static int sod(int n){
            if(n<=0){
                return 1;
            }
            return sod(n/10)*(n%10);
        }
    
    
}
