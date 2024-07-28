public class patterns {
    public static void main(String[] args) {
        pattern6(5);
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
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}