public class CommencePar implements Strategy {

  private String prefixe;

  public CommencePar (String prefixe) {
    this.prefixe = prefixe;
  }

  public boolean estValide(String mot) {
    return mot.startsWith(prefixe);
  }

}
