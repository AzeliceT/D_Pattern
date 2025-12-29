import java.io.IOException;

public class Main2 {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage : java Main2 fichier");
      System.exit(1);
    }

    ListeMot fichier = new ListeMot(args[0]);

    // 2.a AND
    System.out.println("\nMots de longueur 5 ET palindromes :");
    fichier.imprimerSi(new And(new DeLongueur(5), new Palindrome()));

    // 2.b NOT
    System.out.println("\nMots qui NE commencent PAS par 't' :");
    fichier.imprimerSi(new Not(new CommencePar("t")));

    // 2.b OR
    System.out.println("\nMots de longueur 5 OU palindromes (via Or) :");
    fichier.imprimerSi(new Or(new DeLongueur(5), new Palindrome()));


  }
}
