public class ObsCompteurLignes implements Observer {

  private int compteur = 0;

  @Override
  public void traiterLigne(String ligne) {
    compteur++;
  }

  @Override
  public void result() {
    System.out.println("Il y avait " + compteur + " lignes.");
  }

}
