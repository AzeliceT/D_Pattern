public class Album {
    private final String title, artiste, pays, label, marqueD, producteur, version, genre;
    private final int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
    private final boolean albumRemasterise;

    private Album(Builder builder) {
        this.title = builder.title;
        this.artiste = builder.artiste;
        this.pays = builder.pays;
        this.label = builder.label;
        this.marqueD = builder.marqueD;
        this.producteur = builder.producteur;
        this.version = builder.version;
        this.genre = builder.genre;
        this.debitStandard = builder.debitStandard;
        this.debitAbonne = builder.debitAbonne;
        this.albumRemasterise = builder.albumRemasterise;
        this.anneeParution = builder.anneeParution;
        this.anneeParutionOriginal = builder.anneeParutionOriginal;
    }

    public static class Builder {
        private final String title, artiste;
        private String pays, label, marqueD, producteur, version, genre;
        private int anneeParution, anneeParutionOriginal, debitStandard, debitAbonne;
        private boolean albumRemasterise;

        public Builder(String title, String artiste) {
            this.title = title;
            this.artiste = artiste;
        }

        public Builder setPays(String pays) {
            this.pays = pays;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setMarqueD(String marqueD) {
            this.marqueD = marqueD;
            return this;
        }

        public Builder setProducteur(String producteur) {
            this.producteur = producteur;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setAnneeParution(int anneeParution) {
            this.anneeParution = anneeParution;
            return this;
        }

        public Builder setAnneeParutionOriginal(int anneeParutionOriginal) {
            this.anneeParutionOriginal = anneeParutionOriginal;
            return this;
        }

        public Builder setDebitStandard(int debitStandard) {
            this.debitStandard = debitStandard;
            return this;
        }

        public Builder setDebitAbonne(int debitAbonne) {
            this.debitAbonne = debitAbonne;
            return this;
        }

        public Builder setAlbumRemasterise(boolean albumRemasterise) {
            this.albumRemasterise = albumRemasterise;
            return this;
        }

        public Album build(){
            return new Album(this);
        }
    }
}

