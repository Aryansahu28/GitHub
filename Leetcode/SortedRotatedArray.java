// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SortedRotatedArray {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr,int target){
        int pivot = findpivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0,arr.length-1);
        }
        else{
            if(arr[pivot] == target){
                return pivot;
            }
            else if( target >= arr[0]){
                return binarySearch(arr, target, 0,pivot-1);
            }

            return binarySearch(arr, target, pivot+1,arr.length-1);
        }
    }
    static int findpivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(end > mid && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if (mid > start && nums[mid]<nums[mid - 1]){
                return mid-1;
            }
            else if(nums[start] > nums[mid]){
                end = mid -1;
            }
            else if (nums[start]<nums[mid]){
                start = mid +1;
            }
        }
        return -1;
    }
   public static int binarySearch(int[] arr,int target ,int start ,int end){
    while(start<=end){
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            end = mid -1 ;
        }
        else{ 
            start = mid + 1;
        }
    }
    return -1;
   }
}
