package maths_basic_dsa;
// Find the ith bit of a number
public class q3 {
    public static void main(String[] args) {
    System.out.println(ibit(12,1));
    }
    public static int ibit(int givennumber,int givenindex){
        System.out.println(Integer.toBinaryString(givennumber));
        int a = givennumber & ( 1 << givenindex);
        a = a>>givenindex;
        return a;
    }
}
