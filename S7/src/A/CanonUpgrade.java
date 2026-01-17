package A;

public class CanonUpgrade extends Ameliorations {

  private int coefficient;

  public CanonUpgrade(Robot robot) {
    super(robot);
    this.coefficient = 2;
  }

  public CanonUpgrade(Robot robot, int coefficient) {
    super(robot);
    this.coefficient = coefficient;
  }

  @Override
  public int getCanon() {
    return super.getCanon() * coefficient;
  }
}
