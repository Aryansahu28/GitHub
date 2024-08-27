// import java.lang.reflect.Array;

import java.util.Arrays;

public class recursionbubblesort {
    public static void main(String[] args){
        int[] arr = {3,5,1,4,2};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
        
    }

    public static void bubblesort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr,c,c+1);
            }
            bubblesort(arr,r,c+1);
        }
        else{
            bubblesort(arr, r-1, 0);
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }
}
