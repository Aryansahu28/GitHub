public class maxintarray {
    public static void main(String[] args) {
        int[] arr= {1,2,4,63,2,10};
        System.out.println(max(arr));
        }
        public static int max(int[] arr){
            int m = 0;
            for(int i=0; i<arr.length;i++){
               if(m<arr[i]){
                m = arr[i];
               } 
            }
            return m;
        }
}
