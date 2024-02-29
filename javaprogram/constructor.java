class student1{
    int id;
    String name;
    student1(int i,String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class constructor{
    public static void main(String args[]){
        student1 s1 = new student1(1,"ram");
        student1 s2 = new student1(4,"kishan");
        s1.display();
        s2.display();
    }
}