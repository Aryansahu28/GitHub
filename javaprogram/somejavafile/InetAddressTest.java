package somejavafile;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String args[]) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.google.com");
        System.out.println(Address);
        InetAddress sw[] =InetAddress.getAllByName("www.google.com");
        for(int i=0;i< sw.length;i++){
            System.out.println(sw[i]);
        }
    }
}
