package somejavafile;
import java.util.Scanner;
class Animal{
    Animal(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your pet name is " + name);

    }
}

public class constructors {
    public static void main(String[] args) {
        Animal an = new Animal();
    }
}
