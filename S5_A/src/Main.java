public class Main {
    public static void main(String[] args) {
        Album lonerism = new Album.Builder("Lonerism",
                "Tame Impala").setPays("Australie").setAnneeParution(2012).setGenre("indie rock").build(); Album
                orange = new Album.Builder("channel ORANGE",
                "Frank Ocean").setAnneeParution(2012).setGenre("R&B").build();
        Album visions = new Album.Builder("Visions",
                "Grimes").setAnneeParution(2012).setLabel("4AD").setGenre("Electronic").build();

    }
}