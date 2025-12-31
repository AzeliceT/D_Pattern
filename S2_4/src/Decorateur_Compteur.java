
public class Decorateur_Compteur implements Strategy {

  private Strategy strategy;
  private int compteur;

  public Decorateur_Compteur(Strategy strategy) {
    this.strategy = strategy;
    this.compteur = 0;
  }

  @Override
  public boolean estValide(String mot) {
    boolean isValid = strategy.estValide(mot);
    if(isValid){
      compteur++;
    }
    return isValid;
  }

  public int getCompteur() {
    return compteur;
  }

  @Override
  public String toString() {
    return "Decorateur_Compteur " + "strategy = " + strategy + ", compteur=" + compteur + '}';
  }
}
