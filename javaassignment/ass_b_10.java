public class ass_b_10 {
    
 public static void main(String a[]){
    for(int i=1;i<=100000;i++){
        // int i=28;
        int j = 0;
        for(int x=1;x<=i;x++){
            if(i%x==0){
                j = j + x;
            }
        }
        // System.out.println(j);
        // System.out.println(i);
        if(j == 2*i){
            System.out.println(i+" is perfect number");
        }
    }
 }   
}
