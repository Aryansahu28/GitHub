public class patterns {
    public static void main(String[] args) {
        pattern14(5);
    }

    public static void patterns1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void patterns2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totColOfrow = i > n ? 2 * n - i : i;
            for (int j = 0; j < totColOfrow; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern7(int n){
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            int totalCol = 2*i -1;
            for (int j = 0; j < totalCol; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern9(int n){
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            int totalCol = 2*i -1;
            for (int j = 0; j < totalCol; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern11(int n){
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern12(int n){
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                 int spaces = i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            }else{
                
            for (int s = 0; s <= 2*n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i-n; j++) {
                System.out.print("* ");
            }
            }
            System.out.println(" ");
        }
    }
    public static void pattern13(int n){
    for(int i=1;i<=n;i++){
            // Spaces before every mark
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            // for the first row
            if(i==1){
                System.out.print("* ");
            }
            else{
                if(i<n){
                   System.out.print("* ");
                   for(int s=2;s<=2*i-2;s++){
                    System.out.print(" ");
                   }
                   for(int j=1;j<2;j++){
                    System.out.print("* ");
                   }
                }
                else{
                    
                    for(int j=1;j<=2*n;j++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println(" ");
        }
    }
    public static void pattern14(int n){
    for(int i=n;i>=1;i--){
            // Spaces before every mark
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            // for the first row
            if(i==1){
                System.out.print(" * ");
            }
            else{
                if(i<n){
                   System.out.print("* ");
                   for(int s=2;s<=2*i-2;s++){
                    System.out.print(" ");
                   }
                   for(int j=1;j<2;j++){
                    System.out.print("* ");
                   }
                }
                else{
                    
                    for(int j=1;j<=2*n;j++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println(" ");
        }
    }
    public static void pattern15(int n){
        for(int i=1;i<=2*n-1;i++){
            // int totalCol
        }
    }
}