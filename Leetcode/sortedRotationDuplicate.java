public class sortedRotationDuplicate {
    public static void main(String[] args) {
        
    }
    static int findpivotwithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(end > mid && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid]<nums[mid - 1]){
                return mid-1;
            }
            if(nums[start] == nums[mid] && nums[mid]==nums[end]){

                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid] || nums[start] == nums[mid] && nums[mid]>nums[end]){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
