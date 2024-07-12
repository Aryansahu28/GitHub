import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        
    }
    public int[] searchRange(int[] nums, int target){
        int[] ans ={-1,-1};
        ans[0] = searchindex(nums,target,true);
        ans[1] = searchindex(nums,target,false);
        return ans;
    }
    public static int searchindex(int[] nums,int target,boolean firstOccurrence){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int m = start + (end - start)/2;
            if(target > nums[m]){
                start = m + 1;
            }
            else if(target<nums[m]){
                end = m-1;
            }
            else{
                ans = m;
                if(firstOccurrence){
                    end = m - 1; 
                }
                else{
                    start = m + 1;
                }
            }
        }
         return ans;
    }
}
