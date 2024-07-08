public class Evendigits{
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] arr){
        int count = 0;
        for(int i : arr){
            if(digit(i)%2==0)
                count++;
        }
        return count;
    }
    static int digit(int n){
        
        String t = Integer.toString(n);
        int num = t.length();
        return num;
    }
}