package maths_basic_dsa;

// find the number appearing only once in array

public class q2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(uniquenum(arr));
    }
    public static int uniquenum(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
