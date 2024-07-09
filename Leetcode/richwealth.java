// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
public class richwealth {
    public static void main(String[] args){
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        int max=0;
        int max_check=0;
        
        for(int[] a: accounts){
            for(int r : a){
                max_check = max_check + r;
            }
            if(max_check > max){
                max = max_check;
            }
            max_check=0;
        }
        return max;
    }

    

}

