package somejavafile;
class Person{
    private int age;
    private String name;
    public void setage(int a){
        age = a;
    }
    public void setname(String n){
        name = n;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
}

public class encapsulation {
    public static void main(String args[]){
        Person p1 = new Person();
        p1.setage(12);
        p1.setname("Ravi");
        System.out.println(p1.getage());
        System.out.println(p1.getname());

    }
}
