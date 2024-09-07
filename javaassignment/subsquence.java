import java.util.ArrayList;

public class subsquence {
    public static void main(String[] args){
        System.out.println(subsq("","abc"));
    }

    static ArrayList<String> subsq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsq(p+ch,up.substring(1));
        ArrayList<String> right = subsq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
