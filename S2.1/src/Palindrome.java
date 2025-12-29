// Un palindrome est un mot qui se lit de la même façon
// de gauche à droite et de droite à gauche.

public class Palindrome implements Strategy{

  @Override
  public boolean estValide(String mot) {
    if ( mot == null ) {
      return false;
    }
    return mot.contentEquals(new StringBuilder(mot).reverse());
  }
}
