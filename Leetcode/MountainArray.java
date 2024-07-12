// https://leetcode.com/problems/find-in-mountain-array/ 

/**
 * InnerSearchMountain
 */
public interface  MountainArray{
    public static int get(int index){
    
        return 0;
    }
    
}


 class SearchMountain {
    public static void main(String[] args) {
        
    }

    public static int search(int[] nums,int target){
        int peak = PeakSearch(nums);
        int firstTry = OrderAgnostics(nums, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        else{
            return OrderAgnostics(nums, target, peak+1,nums.length-1);
        }
    }
    public static int PeakSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
        if(arr[mid]>arr[mid+1]){
            // We are in the ascending range of array
            end = mid;
        }else{
            // In decreasing order of array
            start = mid + 1;
        }
    }
    return start;
    }
    public static int OrderAgnostics(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            boolean isAsc = arr[start] < arr[end];
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }

            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

