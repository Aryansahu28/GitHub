class sum{
    sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
    sum(double x,double y,double z){
        System.out.println(x+y+z);
    }
    sum(int x,int y,int z,int k){
        System.out.println(x+y+z+k);
    }
}
public class ass_d_11 {
    public static void main(String args[]){
        sum s1 = new sum(1,2,3);
        sum s2 = new sum(2.43,2.45,3.67);
        sum s3 = new sum(1,2,3,4);
        
    }
    
}
