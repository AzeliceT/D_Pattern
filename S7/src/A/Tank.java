package A;

public class Tank implements RobotFactory {

  @Override
  public Robot createRobot() {
    return new Freq_Upgrade(new Stats_Builder.Builder("Tank").getVie(300).getBouclier(2).getCanon(3).build());
  }
}
