import java.util.Scanner;
public class timeconversion {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the seconds: ");
    int secs=sc.nextInt();
    // Convert seconds into Hours
    float hours1 = (float)secs/3600;
    int hours2 =(int)(hours1);
    float mins1 = (float)(hours1-hours2)*60;
    int mins2 = (int)(mins1);
    float seconds1 = (float)(mins1-mins2)*60;
    System.out.println(hours2+" Hours "+ mins2 + " minutes " + Math.round(seconds1) + " seconds ");


 }   
}
