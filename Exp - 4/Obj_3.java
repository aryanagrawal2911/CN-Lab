import java.net.*;

public class Obj_3 {

    public static int getV(InetAddress ia){

        byte[] address = ia.getAddress();
        return address.length;
    }

    public static void main(String[] args) throws UnknownHostException {

        try{

            InetAddress me = InetAddress.getLocalHost();
            int l = getV(me);

            if(l == 4)
                System.out.println(me + " is IPv4");

            else if(l == 6)
                System.out.println(me + " is IPv6");

            else
            System.out.println(me + " is Invalid");
        }

        catch(UnknownHostException exception){

            System.out.println("Could not get local host");
        }
    }
}
