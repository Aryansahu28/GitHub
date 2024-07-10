public class floor {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,10};
        int target = 6;
        flooring(arr, target);
    }
    static void flooring(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target>arr[middle]){
                start = middle + 1;
            }
            else if(target<arr[middle]){
                end = middle -1;
            }
            else{
                System.out.println(target);
                break;
            }
            if(start>end){
                System.out.println(arr[middle]);
                break;
            }
        }
}
}
