public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6,7,10};
        int target = 5;
       int  start = 0 ;
        int end  = arr.length - 1;
        while(start<=end){
            int m = start + (end-start)/2;
            if(target < arr[m]){
                    end = m-1;}
            else if(target>arr[m]){
                start = m+1;
            }
            else{
                System.out.println(m);
                break;
            }

            
        }
    }
}
