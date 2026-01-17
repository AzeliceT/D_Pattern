package A;

public abstract class Ameliorations implements Robot {
  private Robot robot;

  public Ameliorations(Robot robot) {
    this.robot = robot;
  }

  @Override
  public int getCanon() {
    return robot.getCanon();
  }

  @Override
  public int getFreq() {
    return robot.getFreq();
  }

  @Override
  public int getShield() {
    return robot.getShield();
  }

  @Override
  public String getName() {
    return robot.getName();
  }

  @Override
  public int diffLife(int i) {
    return robot.diffLife(i);
  }
}
