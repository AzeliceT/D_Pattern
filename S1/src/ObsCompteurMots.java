public class ObsCompteurMots implements Observer {

  private int compteur = 0;

  @Override
  public void traiterLigne(String ligne) {
    compteur += ligne.split(" ").length;
  }

  @Override
  public void result() {
    System.out.println("Il y avait " + compteur + " mots.");
  }
}
