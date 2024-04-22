public class ass_c_7 {
    public static void Maxelem(int a[][]){
        int max = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Max element in the array is : "+ max);
    }
    public static void main(String args[]){
        int a[][]={
            {1,2,3},
            {4,25,6},
            {7,8,9}
        };
        Maxelem(a);
    }
}
