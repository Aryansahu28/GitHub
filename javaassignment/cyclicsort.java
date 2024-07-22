import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void cyclic(int[] arr){
        for(int i = 0 ; i<arr.length-1;i++){
            if(i!= arr[i] - 1 ){
                swap(arr,i,arr[i] - 1);
                continue;
            }
            
        }
    }
}
