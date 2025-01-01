package somejavafile;
public class coinchange {
    public static void main(String[] args) {
        int[] coin = {2,3,5,10};
        change_coin(coin);

    }

    public static void change_coin(int[] coin){
        int[][] arr = new int[5][15];
        
        
        for(int i =0;i<arr.length-1;i++){
            arr[i][0] = 1;

            for(int j = 0;j<15;j++){
                if(coin[i] > j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = arr[i][j-1] + arr[i][j-coin[i]];
                }
            }

        }

        for(int i = 0; i<arr.length-1;i++){
            for(int j =0;j<15;j++){
                System.out.print(arr[i][j]);
            }
        }

        
    }
}
