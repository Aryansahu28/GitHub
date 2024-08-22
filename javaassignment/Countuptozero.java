public class Countuptozero {
    public static void main(String[] args){
        int n = 12;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        int counter = 0;
        return helper(num,counter);
    }

    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2, c+1);
        }
        return helper(n-1,c+1);
    }
}
