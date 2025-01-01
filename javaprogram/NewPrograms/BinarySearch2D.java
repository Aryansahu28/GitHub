package NewPrograms;

public class BinarySearch2D {
    public static int[] BS2D(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){

            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                BS2D(matrix, row, cstart, mid+1, target);
            }
            else if(matrix[row][mid]<target){
                BS2D(matrix, row, cstart,mid-1, target);
            }
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args){
        
    }
    }
