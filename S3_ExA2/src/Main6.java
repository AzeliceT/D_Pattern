public class Main6 {
    public static void main(String[] args) {
        Magasin magasinDVD = new Magasin(new MagasinDeDVD());

        magasinDVD.ajouter("dvd1", 2001);
        magasinDVD.ajouter("dvd2", 2002);

        Magasin magasinLivre = new Magasin(new MagasinDeLivre());

        magasinLivre.ajouter("livre1", 2003);
        magasinLivre.ajouter("livre2", 2004);

        System.out.println("magasinDVD :");
        magasinDVD.result();

        System.out.println("magasinLivre : \n");
        magasinLivre.result();
    }
}
