package NewPrograms;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.addFirst("E");
        l.removeLast();
        System.out.println(l);
    }
}
