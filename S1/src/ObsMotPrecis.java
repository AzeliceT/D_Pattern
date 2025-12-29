public class ObsMotPrecis implements  Observer {

    private String motPrecis;
    private int compteur = 0;

    public ObsMotPrecis(String motPrecis) {
        this.motPrecis = motPrecis;
    }

    @Override
    public void traiterLigne(String ligne) {
        if ( ligne.toLowerCase().contains(motPrecis.toLowerCase()))
            compteur++;
    }

    @Override
    public void result() {
        System.out.println("Le mot \"" + motPrecis + "\" est apparu " + compteur + " fois.");
    }

}
