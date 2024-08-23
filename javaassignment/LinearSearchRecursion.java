import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,6};
        // System.out.println(findAllIndex(arr,4,0).toString);
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }

    public static boolean LinearSearch(int[] arr,int target,int i){
        if(arr[i] == target){
            return true;
        }
        if(i == arr.length-1){
            return false;
        }
        return LinearSearch(arr,target,i+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int i){
        if(arr[i] == target){
           list.add(i);
        }
        if(i == arr.length-1){
            return;
        }
        findAllIndex(arr,target,i+1);
    }
}
