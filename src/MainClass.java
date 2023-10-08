import java.util.Scanner;

public class MainClass {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer votre message :");
    String msg = sc.nextLine();
 TransAdapterImpl test = new TransAdapterImpl ();
 test.Convert (msg);





  }
}
