import java.io.File;

public class Main {

  public static void main(String[] args) {
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte(
        new ObsCompteurMots(),
        new ObsCompteurLignes(),
        new ObsPalindromes(),
        new ObsMotPrecis("Belgique")
    );

    try{
      analyseurDeTexte.lireFichier(new File("test_mots.txt"));
    } catch (Exception e){
      throw new RuntimeException(e);
    }
  }
}