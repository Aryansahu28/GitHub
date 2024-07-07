public class Evendigits{
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNUmbers(nums));
    }

    static int findNUmbers(int[] nums){
        int count = 0;
        int[] arr = nums;
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            String num = Integer.toString(k);
            if(num.length()%2==0){
                count++;
            }
        }
        return count;
    }
    
}