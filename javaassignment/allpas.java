import java.util.ArrayList;

public class allpas {
    public static void main(String[] args){

        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(String i : num){
            for(String j : num){
                for(String k : num){
                    for(String l : num){
                        System.out.println(i+j+k+l);
                    }
                }
            }
        }
    }
    
}
