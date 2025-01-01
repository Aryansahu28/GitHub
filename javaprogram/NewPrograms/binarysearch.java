package NewPrograms;

public class binarysearch {
    public static void BS(int[] arr,int target,int i ,int j){
        int m = i + (j-i)/2;
        if(arr[m] == target) System.out.println(m);
        else if(arr[m] > target){
            BS(arr,target,i,m-1);
        }
        else if(arr[m] < target){
             BS(arr,target,m+1,j);
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        BS(arr,7,0,arr.length-1);
        
    }
}
