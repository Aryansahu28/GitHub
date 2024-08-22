import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k);
        String s = "abcdcba";

        isPalindrome(s);

    }

    // @SuppressWarnings("unlikely-arg-type")
    public static void isPalindrome(String s) {
        String rev="";
       for(int i = s.length()-1;i>=0;i--){
        rev = rev + s.charAt(i);
       }
       System.out.println(rev);
       if(s.equals(rev)){
        System.out.println(true);
       }else{
        System.out.println(false);
       }
    }
}
