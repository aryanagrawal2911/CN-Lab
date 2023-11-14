import java.net.*;
import java.util.Enumeration;

public class Obj_4 {

    public static void main(String[] args) throws SocketException {

        Enumeration <NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

        while(interfaces.hasMoreElements()){

            NetworkInterface nwif = interfaces.nextElement();
            System.out.println(nwif);
        }
    }
}
