import java.net.*;


public class Obj_2 {

    public static void main(String[] args) {

        try{

            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }

        catch(UnknownHostException exception){

            System.out.println("Could not get local host");
        }
    }
}
