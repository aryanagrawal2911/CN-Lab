import java.net.*;

public class misc {

    public static void main(String[] args) {

        String ipString = "13.215.144.61";

        try{
            InetAddress address = InetAddress.getByName(ipString);
            System.out.println(address);
        }

        catch(UnknownHostException exception){
            System.out.println("Could not find " + ipString);
        }
    }
}
