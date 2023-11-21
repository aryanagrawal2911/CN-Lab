import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Obj_1 {

    static void downloadObject(String site) {

        try {

            URL ur = new URI(site).toURL();

            Object obj = ur.getContent();
            System.out.println("I got a : " + obj.getClass().getName());
        }

        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    static void downloadWebpage(String site) {

        try {

            URL ur = new URI(site).toURL();

            BufferedReader inp = new BufferedReader(new InputStreamReader(ur.openStream()));
            String readLine;

            while ((readLine = inp.readLine()) != null)
                System.out.println(readLine);

            inp.close();
        }

        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the URL : "); // Used URL is : {https://theuselessweb.com}
        String site = sn.next();
        sn.close();

        downloadObject(site);
        downloadWebpage(site);
    }
}