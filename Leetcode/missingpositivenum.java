public class missingpositivenum {
    public static void main(String[] args) {
        
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
             while(i<nums.length){
                int correct = nums[i] -1;
                 if(nums[i]>0 && nums[i]!=nums[correct] && nums[i]<nums.length){
                    swaps(nums, i, correct);
                 }
                 else{
                     i++;
                     }
                     
                    }
        for(int index =0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
         }
         public static void swaps(int[] nums,int first,int second){
             int temp = nums[first];
             nums[first] = nums[second];
             nums[second] = temp;
         }
        
    }

