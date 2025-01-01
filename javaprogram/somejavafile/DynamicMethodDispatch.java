package somejavafile;
// Dynamic Method Dispatch in java describes about how we can initiate the objects in the program and what will be the outcome if we use Different class name and inherited class name what will be the outcome of it. It is another type of Polymorphism.
class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String args[]){
        
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
}

