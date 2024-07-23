// Find the Duplicate number

import java.util.Arrays;

public class Duplicatenum {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,3,5};
        // System.out.println(Arrays.toString(findDuplicate(nums)));
    }
    class Solution {
        public static int findDuplicate(int[] nums){
        int i = 0;
             while(i<nums.length){
                 if(nums[i]!=i+1){
                 int correct = nums[i] - 1;
                 if(nums[i] !=nums[correct]){
                     swaps(nums,i, correct);
                 }
                 else{
                     return nums[i];
                 }
                 }
                 else{
                     i++;
                     }
             }
             return -1;
         }
         public static void swaps(int[] nums,int first,int second){
             int temp = nums[first];
             nums[first] = nums[second];
             nums[second] = temp;
         }
     }
}
