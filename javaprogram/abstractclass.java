abstract class Figure{
    double dim1;
    double dim2;

    Figure(double a , double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }
}

class Square extends Figure{
    Square(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }
}

public class abstractclass {
    public static void main(String args[]){
        // Figure f = new Figure(2.12,4.12);
        Rectangle r = new Rectangle(9,5);
        Square s = new Square(7,10);
        // Figure figref;
        // figref = r;
        System.out.println("Area is " + r.area());

        // figref = s;
        System.out.println("Area is " + s.area());
    }   
}
