public class triangle1 {
    public static void main(String[] args) {
        int n = 5;
        triangle(n);
        System.out.println(" ");
        triangle2(5, 0);
    }

    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        if (n == 0) {
            return;
        }
        System.out.println(" ");
        triangle(n - 1);
    }

    public static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        } 
        if(c<r){
            System.out.print("* ");
            triangle2(r,c+1);
        }
        else{
            System.out.println();
            triangle2(r-1,0);
        }
    }
}