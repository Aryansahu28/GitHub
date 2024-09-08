import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutationsubstring {
    public static void main(String[] args){
        ArrayList<String> ans = permuArray("","abc");
        System.out.print(ans);
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permuArray(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // Local to this call
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0;i<=p.length();i++){
            
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permuArray(f + ch  + s , up.substring(1)));
        }
        return ans;
    }
}
