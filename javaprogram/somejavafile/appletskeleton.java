package somejavafile;
import java.applet.Applet;
import java.awt.Graphics;

public class appletskeleton extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello", 100,100);
    }
}


/*<html>
 * <applet code="Test,class" CodeBase="" width=100 height=400></applet>
 * </html>
 */