class Calculator {
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public double add(double n1,int n2){
        return n1 + n2;
    }
}

public class methodov {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        double r1=calc.add(2.343,1);
        System.out.println(r1);
        int r2 = calc.add(1,3,5);
        System.out.println(r2);
        int r3 = calc.add(1,4);
        System.out.println(r3);
    }
    
}
