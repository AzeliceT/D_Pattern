package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class MasterCardGenerateur extends Generateur{

    public MasterCardGenerateur(Generateur suivant) {
        super(suivant);
    }

    @Override
    public boolean valider(String numero) {
        int p = Integer.parseInt(numero.substring(0,2));
        return p >= 51 && p <= 55 && numero.length() == 16;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        return new MasterCard(numero, dateExpiration, nom);
    }

}
