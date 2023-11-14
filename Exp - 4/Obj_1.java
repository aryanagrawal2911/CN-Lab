import java.net.*;

public class Obj_1 {

    public static void main(String[] args) throws UnknownHostException {

        String urlString = "theuselessweb.com";

        try{
            InetAddress address = InetAddress.getByName(urlString);
            System.out.println(address);
        }

        catch(UnknownHostException exception){
            System.out.println("Could not find " + urlString);
        }
    }
}