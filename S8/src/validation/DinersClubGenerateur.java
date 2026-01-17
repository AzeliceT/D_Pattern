package validation;

import domaine.CarteDeCredit;
import domaine.DinersClub;

import java.util.Calendar;

public class DinersClubGenerateur extends Generateur{

    public DinersClubGenerateur(Generateur suivant) {
        super(suivant);
    }

    @Override
    public boolean valider(String numero) {
        return numero.startsWith("36") && numero.length() == 14;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        return new DinersClub(numero, dateExpiration, nom);
    }
}
