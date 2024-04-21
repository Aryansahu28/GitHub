import java.util.Scanner;
public class ass_c_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter no. "+(i+1)+" :");
            a[i] = sc.nextInt();
        }
        int flag_even=0;
        int flag_odd =0;
        int flag_pos = 0;
        int flag_neg = 0;
        for(int i =0;i<10;i++){
            if(a[i]<0){
                flag_neg = flag_neg + 1;
                if(a[i]%2==0)
                        {flag_even=flag_even+1;}
                else{
                    flag_odd = flag_odd + 1;
                }
            }
            else if(a[i]>=0){
                flag_pos = flag_pos + 1;
                if(a[i]%2==0)
                        {flag_even=flag_even+1;}
                else{
                    flag_odd = flag_odd + 1;
                }
            }
        }
        System.out.println("Number of even in array : "+flag_even);
        System.out.println("Number of odd in array : "+flag_odd);
        System.out.println("Number of positive in array : "+flag_pos);
        System.out.println("Number of negative in array : "+flag_neg);
    }
}
