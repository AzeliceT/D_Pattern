public class pasAssezState extends State {

  @Override
  public void entrerMonnaie(MachineACafe machineACafe, Piece piece){
    int montantAvant = machineACafe.getMontantEnCours();

    montantAvant += piece.getValeur();
    machineACafe.setMontantEnCours(montantAvant);
    machineACafe.afficherMontant();

    if (machineACafe.boisson.getPrix() > montantAvant) {
      machineACafe.afficherPasAssez(machineACafe.boisson);
    } else {

      montantAvant -= machineACafe.boisson.getPrix();
      machineACafe.setMontantEnCours(montantAvant);

      machineACafe.afficherBoisson(machineACafe.boisson);
      machineACafe.boisson = null;
      machineACafe.afficherMontant();
      if (montantAvant == 0)
        machineACafe.setEtatCourant(new InactifState());
      else
        machineACafe.setEtatCourant(new CollecteSate());
    }
  }

  @Override
  public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    throw new IllegalStateException("Selection impossible : montant insuffisant");
  }
}
