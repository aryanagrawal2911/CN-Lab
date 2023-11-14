import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Obj_3 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the URL : ");
        String url = sn.nextLine();
        sn.close();

        try{

            URI u = new URI(url);
            System.out.println("The protocol is : " + u.getScheme());
            System.out.println("The user info is : " + u.getUserInfo());

            String host = u.getHost();

            if (host != null)
                System.out.println("The host is : " + host);

            else
                System.out.println("The host is null!");

            System.out.println("the port is : " + u.getPort());
            System.out.println("the path is : " + u.getPath());
            System.out.println("the query string is : " + u.getQuery());

        }

        catch(URISyntaxException ex){
            System.out.println(ex);
        }
    }
}
