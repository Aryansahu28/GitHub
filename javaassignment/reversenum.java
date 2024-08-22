public class reversenum {
   public static void main(String[] args){
      int n = 1234;
      System.out.println(reversing_2(n));
      
   } 
   public static void reversing_1(int n){
      String r = Integer.toString(n);
      StringBuffer sb = new StringBuffer(r);
      sb.reverse();
      System.out.println(sb);
   }

   static int reversing_2(int n){
      int digits = (int)(Math.log10(n)+1);
      return helper(n,digits);
      
   }

   private static int helper(int n,int argument){
         if(n%10 == n){
            return n;
         }
         int rem = n%10;
         return rem*(int)(Math.pow(10,argument-1)) + helper(n/10, argument-1);
   }
}

