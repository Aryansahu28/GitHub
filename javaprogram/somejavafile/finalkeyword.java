package somejavafile;
//Final keyword for the class so that no one can inherites class from my super class
final class A{

}

class B{
    //This is final keyword for the method so there will be no execution if overriding happens
    public final void show(){
        System.out.println("Hello, this is B");
    }
}

public class finalkeyword {
    public static void main(String[] args){
        final int num = 12; //This final keyword works as variable constant so we cannot change it
    }
}
