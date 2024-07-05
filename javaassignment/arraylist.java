import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>(10);
        list.add(123);
        list.add(564);
        list.add(5667);
        list.add(345465);
        list.add(167);
        System.out.println(list);
        list.set(2,453);
    }
}
