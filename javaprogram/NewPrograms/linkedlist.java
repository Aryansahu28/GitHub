package NewPrograms;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("T");
        l.addFirst("E");
        // l.removeLast();
        int a= l.size();
        String d = l.get((int)a/2);
        System.out.println(l);
        System.out.println(a);
        System.out.println(d);
    }
}
