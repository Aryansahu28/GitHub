

public class conversion {
    public static void main(String[] args){
        float cm = (float) 1233.32; // In centimeter
        int foot = (int)(cm*0.0328084);
        System.out.println(foot);
        
        String inches = String.format("%.1f",(cm*0.393701));
         float inc = Float.parseFloat(inches);
         System.out.println(inc);
    }
}
