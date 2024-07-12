public class Peakinarray {
    public static void main(String[] args) {
        

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
}
