package somejavafile;
public class treerecursion {
    public static void tree(int n){
        if(n>0){
            System.out.print(n+" ");
            tree(n-1);
            tree(n-1);
        }
    }
    public static void main(String args[]){
        tree(5);
    }
}
