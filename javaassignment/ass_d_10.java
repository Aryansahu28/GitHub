import java.util.Scanner;
class decimalOCtal{
    static int j =0;
    static int dec_to_oct(int n){
       if(n!=0){

        int r = n%8;
        j = j*10 + r;
        dec_to_oct(n/8);
    }
    return j;
}
}
public class ass_d_10 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to octal");
        int n = sc.nextInt();
        decimalOCtal dco = new decimalOCtal();
        System.out.println(dco.dec_to_oct(n));
    }
}
