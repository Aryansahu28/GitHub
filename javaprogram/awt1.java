import java.awt.*;

class awt_test extends Frame{
    awt_test(){
        Button b = new Button("Click here");
        b.setBounds(500, 500, 500, 500);
        b.setSize(800,800);
        setLayout(null);
        setVisible(true);
    }
}
public class awt1 {
    public static void main(String args[]){
        awt_test a1 = new awt_test();
    }
}
