package A;

public class Bouclier_Upgrade extends Ameliorations {
  private int coefficient;

  public Bouclier_Upgrade(Robot robot) {
    super(robot);
    coefficient = 2;
  }

  public Bouclier_Upgrade(Robot robot, int coefficient) {
    super(robot);
    this.coefficient = coefficient;
  }

  @Override
  public int getShield() {
    return super.getShield() * coefficient;
  }
}
