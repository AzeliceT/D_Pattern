package validation;

import domaine.CarteDeCredit;
import domaine.Discover;

import java.util.Calendar;

public class DiscoverGenerateur extends Generateur{

    public DiscoverGenerateur(Generateur suivant) {
        super(suivant);
    }

    @Override
    public boolean valider(String numero) {
        return (numero.startsWith("6011") || numero.startsWith("65")) && numero.length() == 16;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        return new Discover(numero, dateExpiration, nom);
    }

}
