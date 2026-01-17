package A;

public class GrosseBerta implements RobotFactory {

  @Override
  public Robot createRobot() {
    return new CanonUpgrade(new Stats_Builder.Builder("Grosse Berta").getFreq(160).build(),3);
  }

}
