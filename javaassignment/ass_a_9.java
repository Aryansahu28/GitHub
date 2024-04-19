public class ass_a_9 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int n = a.length - 1;
        System.out.println("Median above array :");
        if (a.length%2==0){
            float t = ((a[(int)(n/2)]+a[((int)(n/2))+1]));
            System.out.println(t/2);
        }
        else{
            int t = a[(int)(n/2)];
            System.out.println(t);
        }
    }
}
