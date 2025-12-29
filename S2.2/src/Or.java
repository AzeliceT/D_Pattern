public class Or implements Strategy {

  private Strategy s1, s2;

  public Or (Strategy s1, Strategy s2) {
    this.s1 = s1;
    this.s2 = s2;
  }
  public boolean estValide(String mot) {
    return s1.estValide(mot) || s2.estValide(mot);
  }
}
