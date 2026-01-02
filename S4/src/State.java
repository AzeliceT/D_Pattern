public abstract class State {

  public void entrerMonnaie(MachineACafe machineACafe, Piece piece) {

    int montantAvant = machineACafe.getMontantEnCours();
    montantAvant += piece.getValeur();
    machineACafe.setMontantEnCours(montantAvant);

    machineACafe.afficherMontant();

    // if ( etatCourant != pasAssez) // il assez de thune donc
    machineACafe.setEtatCourant(new CollecteSate());
  }


  public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    int montantAvant = machineACafe.getMontantEnCours();
    if (toucheBoisson.getPrix() > montantAvant) {
      machineACafe.boisson = toucheBoisson;
      machineACafe.afficherPasAssez(machineACafe.boisson);
      machineACafe.boisson = toucheBoisson;
      // machineACafe.etatCourant =  pasAssez; voir line 19
      machineACafe.setEtatCourant(new pasAssezState());
      return;
    }

    montantAvant -= toucheBoisson.getPrix();
    machineACafe.setMontantEnCours(montantAvant);

    machineACafe.afficherBoisson(toucheBoisson);
    machineACafe.afficherMontant();
    if (montantAvant == 0) {
      machineACafe.setEtatCourant(new InactifState());
    } else {
      machineACafe.setEtatCourant(new CollecteSate());
    }
  }

  public void rendreMonnaie(MachineACafe machineACafe){
    machineACafe.afficherRetour();
    machineACafe.setMontantEnCours(0);
    machineACafe.boisson = null;
  }
}

