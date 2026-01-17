package A;

public class Freq_Upgrade extends Ameliorations {

  private int coefficient;

  public Freq_Upgrade(Robot robot) {
    super(robot);
    coefficient = 2;
  }

  public Freq_Upgrade(Robot robot, int coefficient) {
    super(robot);
    this.coefficient = coefficient;
  }

  @Override
  public int getFreq() {
    return super.getFreq() * coefficient;
  }
}
