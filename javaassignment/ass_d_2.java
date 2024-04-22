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

public class ass_d_2 {
    public static void main(String args[]){
        PalindromeStr Pstr = new PalindromeStr();
        String str = "HELLO";
        Pstr.check_pal(str);
    }
    
}
