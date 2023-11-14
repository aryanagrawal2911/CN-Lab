import java.net.*;

public class misc1 {

    public static void main(String[] args) {

        String urlString = "theuselessweb.com";

        try{
            InetAddress[] addresses = InetAddress.getAllByName(urlString);

            for (InetAddress address : addresses)
                System.out.println(address);
        }

        catch(UnknownHostException exception){
            System.out.println("Could not find " + urlString);
        }
    }
}
