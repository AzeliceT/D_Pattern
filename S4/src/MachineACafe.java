public class MachineACafe {

	private int montantEnCours = 0;
	public ToucheBoisson boisson = null;
	private State etatCourant;

	public MachineACafe() {
		setEtatCourant(new InactifState());
	}

	public int getMontantEnCours() {
		return montantEnCours;
	}

	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public void setEtatCourant(State etatCourant) {
		this.etatCourant = etatCourant;
	}

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}

	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}

	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);

	}

	public void entrerMonnaie(Piece piece) {

		etatCourant.entrerMonnaie(this, piece);
	}

	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {

		etatCourant.selectionnerBoisson(this, toucheBoisson);

	}

	public void rendreMonnaie() {
		etatCourant.rendreMonnaie(this);
	}
}
