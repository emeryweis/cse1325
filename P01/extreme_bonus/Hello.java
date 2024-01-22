import java.util.Scanner;
import java.net.InetAddress;
public class Hello{
    public static void main(String[] args){
        try {
            //Scanner in = new Scanner(System.in);
            String name = InetAddress.getLocalHost().getHostName();

            //System.out.println("What is your name: ");
            //name = in.nextLine();
            System.out.println("Hello " + name + "!");
        }
        catch (Exception e) {
            System.out.println("Couldn't find hostname");
        }
    }
}