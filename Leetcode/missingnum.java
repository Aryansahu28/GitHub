// https://leetcode.com/problems/missing-number/description/

// Given an numsay nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the numsay.



public class missingnum {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        
        System.out.println(missingNumber(nums));
    }
    public static void swaps(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static int missingNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]< nums.length && nums[i] !=i){
                swaps(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
        }
    }

