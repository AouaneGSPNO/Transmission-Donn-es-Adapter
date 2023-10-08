import java.io.File;

public class TransAdapterImpl implements TransAdapter {

  String message;


  @Override
  public String Convert(String msg) {
    this.message=msg;
    System.out.println ("Conversion en binaire et hexa réussie\n votre message est prêt pour être transmi");
    return message;
  }
}
