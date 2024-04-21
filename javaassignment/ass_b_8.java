public class ass_b_8 {
    public static void main(String args[]){
        int a[] = {1,2,4,5,6,7,8,9,10};
        int max=-1;
        int min=2147483647;
        for(int i = 0; i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
            else if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
