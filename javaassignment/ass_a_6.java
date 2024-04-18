public class ass_a_6 {
    public static void main(String args[]){
        int a=1,b=2,c=1;
        double D = b*b - 4*a*c;
        if(D>0){
            double x1 = ((0-b)+Math.sqrt(D))/(2*a);
            double x2 = ((0-b)-Math.sqrt(D))/(2*a);
            System.out.println("Roots are "+String.format("%.2f",x1) +" and " + String.format("%.2f",x2)+" real and distinct");
        }
        else if(D<0){
            String roots1 = "(-"+b+"+"+(int)(D*(0-1))+"i"+")/"+(2*a);
            String roots2 = "(-"+b+"-"+(int)(D*(0-1))+"i"+")/"+(2*a);
            System.out.println("Roots are complex and they are: "+ roots1+" and "+roots2);
        }
        else{
            
            System.out.println("Roots are equal, so root is :"+((0-b)/(2*a)));
        }
    }
}
