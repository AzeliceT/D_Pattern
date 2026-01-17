package A;

import java.util.HashMap;

public class FactoryFlyweight {

  private HashMap<String, RobotFactory> robotsFactories = new HashMap<>();


  public void putFactory(String nom, RobotFactory factory) {
    robotsFactories.put(nom, factory);
  }


  public Robot create(String nom) {
    return robotsFactories.get(nom).createRobot();
  }

}
