public class Palindrome implements Strategy {

  @Override
  public boolean estValide(String mot) {
    if ( mot == null ) {
      return false;
    }
    return mot.contentEquals(new StringBuilder(mot).reverse());
  }

}
