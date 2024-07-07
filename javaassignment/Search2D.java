// Linear Search in 2D array

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5},
            {12,13,14,15},
            {7,8,9}
        };
        int target = 15;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[][] a,int target){
        for(int row =0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                if(a[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
