public class Main5 {
    public static void main(String[] args) {
        Magasin magasinDVD = new MagasinDeDVD();

        magasinDVD.ajouterArticle("dvd1", 2001);
        magasinDVD.ajouterArticle("dvd2", 2002);

        Magasin magasinLivre = new MagasinDeLivre();

        magasinLivre.ajouterArticle("livre1", 2003);
        magasinLivre.ajouterArticle("livre2", 2004);

        System.out.println("magasinDVD :");
        magasinDVD.result();

        System.out.println("magasinLivre : \n");
        magasinLivre.result();
    }
}
