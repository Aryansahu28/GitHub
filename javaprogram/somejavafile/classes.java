package somejavafile;
class room {
    public void rom() {
        System.out.println("Time to print something");
    }
}

public class classes {
    public static void main(String a[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);

            room r = new room();
            r.rom();
        }
    }
}
