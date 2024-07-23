import java.util.Arrays;

public class duplicateandnumber {
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums){
        int i = 0;
             while(i<nums.length){
                int correct = nums[i] -1;
                 if(nums[i]!=nums[correct]){
                 
                 }
                 else{
                     i++;
                     }
             }
             for(int index =0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return new int[]{nums[index],index+1};
                }
             }
             return new int[]{-1,-1};
         }
         public static void swaps(int[] nums,int first,int second){
             int temp = nums[first];
             nums[first] = nums[second];
             nums[second] = temp;
         }
     }


