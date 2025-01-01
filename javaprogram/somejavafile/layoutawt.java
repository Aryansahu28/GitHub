package somejavafile;
import java.awt.*;
class layoutmanager extends Frame{
    layoutmanager() {
        Button b1 = new Button("North Region");
        Button b2 = new Button("West Region");
        Button b3 = new Button("East Region");
        Button b4 = new Button("South Region");
        Frame f = new Frame("Layout");
        setBounds(30, 100, 80, 40);
        setSize(200, 200);
        f.setLayout(new BorderLayout());
        f.add(b1,"North");
        f.add(b2,"West");
        f.add(b3,"East");
        f.add(b4,"South");
    }
}

public class layoutawt {
    public static void main(String args[]){
        layoutmanager l1 = new layoutmanager();
    }
}
