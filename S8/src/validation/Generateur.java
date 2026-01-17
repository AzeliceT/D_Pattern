package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur {

	private Generateur suivant;

	public Generateur(Generateur suivant) {
		this.suivant = suivant;
	}

	public abstract boolean valider(String numero);

	public abstract CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom);

	public CarteDeCredit gererDemande(String numero, Calendar dateExpiration, String nom) {
		if (valider(numero)) {
			return creerCarte(numero, dateExpiration, nom);
		}
		if (suivant != null) {
			return suivant.gererDemande(numero, dateExpiration, nom);
		}
		return null;
	}
}
