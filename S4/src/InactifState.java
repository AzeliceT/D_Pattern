public class InactifState extends State {

  @Override
  public void selectionnerBoisson(MachineACafe machineACafe, ToucheBoisson toucheBoisson) {
    machineACafe.afficherPasAssez(toucheBoisson);
  }

  @Override
  public void rendreMonnaie(MachineACafe machineACafe) {
    machineACafe.setEtatCourant(new InactifState());
  }
}
