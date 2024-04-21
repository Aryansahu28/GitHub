class Palindromeint{
    boolean check_pal(int x){
        int temp = x;
        int t = 0;
        while(x>0){
            int r =x%10;
            t = t*10 + r;
            x = (x/10);
        }
        System.out.println(t);
        if(temp == t){
            return true;
        }
        else{
            return false;
        }
    }
}
class PalindromeStr{
    void check_pal(String s){
        String temp = s;
        // System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        // System.out.println(sb);
        String str = sb.toString();
        // System.out.println(str);

        if(str.equals(temp)){
            System.out.print(true);
            
        }
        else{
            System.out.println(false);
        }
        
    }
}
public class ass_b_7 {
    public static void main(String args[]){
        Palindromeint pnt = new Palindromeint();
        System.out.println(pnt.check_pal(57866875));
        PalindromeStr pnr = new PalindromeStr();
        pnr.check_pal("avon seees nova");
    }
}
