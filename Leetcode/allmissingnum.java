// Find all the numbers disappeared in an array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class allmissingnum {
 public static void main(String[] args) {
    int[] nums={4,3,2,7,8,2,3,1};
    
    
 }   
 public static void swaps(int[] nums,int first,int second){
 int temp = nums[first];
 nums[first] = nums[second];
    nums[second] = temp;
}
public static List<Integer> findDisappearedNumbers(int[] nums){
    List<Integer> list = new ArrayList<>();
    int i=0;
    while(i<nums.length){
        int correct = nums[i] -1;
        if(nums[i] != nums[correct]){
            swaps(nums, i, correct);
        }
        else{
            i++;
        }
    }
    for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            list.add(index+1);
        }
    }
    return list;
} 
}
