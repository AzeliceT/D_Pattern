public class ObsPalindromes implements Observer{

  private int result;

  @Override
  public void traiterLigne(String ligne) {
    String[] mots = ligne.split(" ");

    for (String mot : mots) {
        if(isPalindrome(mot.toLowerCase()))
            result++;
    }
  }

  @Override
  public void result() {
    System.out.println("Il y avait " + result + " mots palindromes.");
  }

  private boolean isPalindrome(String mot){
    StringBuilder temp = new StringBuilder(mot);
    return mot.equals(temp.reverse().toString());
  }
}
