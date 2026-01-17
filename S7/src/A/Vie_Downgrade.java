package A;

public class Vie_Downgrade extends Ameliorations {

  private int coefficient;

  public Vie_Downgrade(Robot robot) {
    super(robot);
    coefficient = 2;
  }

  public Vie_Downgrade(Robot robot, int coefficient) {
    super(robot);
    this.coefficient = coefficient;
  }

  @Override
  public int diffLife(int i) {
    return super.diffLife(i/coefficient);
  }
}
