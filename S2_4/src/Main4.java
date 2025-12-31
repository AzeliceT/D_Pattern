import java.io.IOException;

public class Main4 {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage : java Main3 fichier");
      System.exit(1);
    }

    ListeMot fichier = new ListeMot(args[0]);

    // 2.a AND
    System.out.println("\nMots de longueur 5 ET palindromes ET qui commence par 't':");
    fichier.imprimerSi(new And(new DeLongueur(5), new Palindrome(), new CommencePar("t")));

//    // 2.b NOT
//    System.out.println("\nMots qui NE commencent PAS par 't' :");
//    fichier.imprimerSi(new Not(new CommencePar("t")));
//
    // 2.b OR
    System.out.println("\nMots de longueur 5 OU palindromes (via Or) :");
    fichier.imprimerSi(new OR(new DeLongueur(5), new Palindrome(), new CommencePar("t")));

    // 4. Decorateur Compteur
    Decorateur_Compteur decorateurCompteur = new Decorateur_Compteur(new And(new Palindrome(), new CommencePar("t")));
    System.out.println("\nMots palindromes ET qui commencent par 't' (avec compteur) : ");
    fichier.imprimerSi(decorateurCompteur);
    System.out.println("\nNombre de mots valides : " + decorateurCompteur.getCompteur());

  }
}
