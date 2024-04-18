public class ass_a_5 {
    public static void main(String args[]){
        int a = 5;
        int b = 8;
        // We have to add a and b without using * operator so we will run loop for b times adding 1 each time
        for(int i = 0;i<b;i++){
            a = a+1;
        }
        System.out.println(a);
    }
}
