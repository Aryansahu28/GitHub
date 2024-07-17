import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            // Internal loop for j so that it can swap we perform from j = 1  to the arr.length - i
            for(int j =1; j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                
            }
            if(!swapped){ // If !false = true If swapped takes place then it will be false so it will not enter into the loop
                break;
            }
        }
    }
}
