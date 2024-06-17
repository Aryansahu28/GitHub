class head{
    void heading(int n){
        if(n>0){
            heading(n-1);
            System.out.print(n+" ");
        }
    
    }
}
public class headrecursion {
    public static void main(String args[]){
        int a = 5; 
        head h = new head();
        h.heading(a);
    }
}
