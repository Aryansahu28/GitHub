package somejavafile;
class Mathematics{
    Mathematics(int a,int b){
        System.out.println(a+b);
    }
    Mathematics(int a ,int b,int c){
        System.out.println(a*b*c);
    }
}

public class constoverloading {
    public static void main(String[] args){
        Mathematics maths = new Mathematics(12, 43);
        Mathematics math = new Mathematics(2,4,6);
    }
}
