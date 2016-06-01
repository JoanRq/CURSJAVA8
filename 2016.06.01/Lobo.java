import javax.security.cert.CertificateException;

public class Lobo extends Canino {
  public CertificateException getMedia() throws CertificateException {
    return new CertificateException();
  }
  
  public static void main(String[] args) throws Exception {
    System.out.println(new Canino().getMedia());
    System.out.println(new Lobo().getMedia());
  }
}