package A;

public class PicVert implements RobotFactory {

  @Override
  public Robot createRobot() {
    return new Stats_Builder.Builder("Pic Vert").getFreq(60).getBouclier(1).getCanon(3).build();
  }

}
