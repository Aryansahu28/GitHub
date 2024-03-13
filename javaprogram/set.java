import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Ravi");
        names.add("Sumit");
        names.add("Abhisek");
        names.add("Tushar");
        names.remove("Sumit");
        names.clear();
        // System.out.println(names.size());
        // System.out.println(names.contains("Abhiseks"));
        System.out.println(names.isEmpty());
    }
    
}
