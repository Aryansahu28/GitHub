import java.util.Scanner;
class Usingthis{
    private int age;
    private String name;
    void getname(){
        
        System.out.println("Is your name "+ name);
    }
    void getage(){
        System.out.println(age);
    }
    void SetName(String n){
        name = n;
    }
    void SetAge(int age){
        this.age = age;
    }
}
public class thiskeyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Enter your name :");
        Scanner ts = new Scanner(System.in);
        String name = ts.nextLine();
        Usingthis obj = new Usingthis();
        obj.SetAge(age);
        obj.SetName(name);
        obj.getage();
        obj.getname();
    }
}
