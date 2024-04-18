import java.util.Scanner;
public class ass_a_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your measurement in Centimeter:");
        float centimeter = sc.nextFloat();
        double feet = centimeter*0.03281;
        double inches = (feet - (int)feet)*12;
        System.out.println("Conversion is "+(int)feet+"ft "+String.format("%.1f", inches)+"inches");
    }
}
