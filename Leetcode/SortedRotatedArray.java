// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SortedRotatedArray {
    public static void main(String[] args) {

        int[] arr = {5,1,2};
        int target = 5;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr,int target){
        int peak = PeakSearch(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        else{
            return binarySearch(arr,target,peak+1,arr.length-1);
        }
    }
    static int pivot(int[] nums){
        
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
