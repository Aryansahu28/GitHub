package somejavafile;
public class IndirectRecursion {
    public static void FunA(int n){
        if(n>0){
            System.out.print(n+" ");
            FunB(n-1);
        }
    }
    public static void FunB(int n){
        if(n>1){
            System.out.print(n+" ");
            FunA((int)n/2);
        }
    }
    public static void main(String args[]){
        FunA(3);
    }
}
