public class ass_c_6 {
    public static void main(String args[]){
        int[][] a ={
            {2,4,6,8},
            {0,3,6,9},
            {0,0,4,8},
            {0,0,0,5}
        };
        int flag=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if((i<j) & (a[i][j]==0)){
                    flag=flag+1;
                }
            }
        }
        System.out.println(flag);
    }
}
