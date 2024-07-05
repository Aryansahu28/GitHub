import java.util.Arrays;
import java.util.Scanner;

public class javaarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {1,3,5},
            {2,3,6},
            {2,5,3,7}
        };
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
         }
        // for(int row=0;row<arr.length;row++){
        //     for(int col = 0 ; col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println(" ");
        // }


        // for(int row = 0 ; row < arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
    
         for(int[] num  : arr){
            System.out.println(Arrays.toString(num));//Advanced for-loops
         }
    
    }

}
