public class sortedarr {
    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,6};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr,i+1);
    }

}
