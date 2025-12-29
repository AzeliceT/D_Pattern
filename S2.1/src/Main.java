import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage : java Main fichier");
      System.exit(1);
    }

    ListeMot liste = new ListeMot(args[0]);

    System.out.println("Mots qui commencent par 't' :");
    liste.imprimerSi(new CommencePar("t"));

    System.out.println("\nMots de longueur 5 :");
    liste.imprimerSi(new DeLongueur(5));

    System.out.println("\nPalindromes :");
    liste.imprimerSi(new Palindrome());
  }
}

//import java.io.IOException;

//public class Main {
//  public static void main(String[] args) throws IOException {
//    ListeMot liste = new ListeMot("test_mots.txt"); // on crée un contexte
//
//    System.out.println("Mots qui commencent par 't' :");
//    liste.imprimerSi(new CommencePar("t"));
//
//    System.out.println("\nMots de longueur 5 :");
//    liste.imprimerSi(new DeLongueur(5));
//
//    System.out.println("\nPalindromes :");
//    liste.imprimerSi(new Palindrome());
//  }
//}
