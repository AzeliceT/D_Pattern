public class Not implements Strategy {

  private Strategy s;

  public Not(Strategy s) {
    this.s = s;
  }
  public boolean estValide(String mot) {
    return !s.estValide(mot);
  }
}
