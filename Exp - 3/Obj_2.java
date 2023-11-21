import java.util.Scanner;

class WorkerThread extends Thread {

    int x, y;

    WorkerThread(int n1, int n2) {
        x = n1;
        y = n2;
    }

    public void run() {

        int result = x + y;
        onResult(result);
    }

    void onResult(int result) {

        System.out.println("Received result from the thread : " + result);
    }

}

public class Obj_2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a and b : ");
        a = sn.nextInt();
        b = sn.nextInt();
        sn.close();

        WorkerThread wt = new WorkerThread(a, b);
        wt.start();
    }
}
