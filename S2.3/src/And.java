import java.util.ArrayList;
import java.util.List;

public class And implements Strategy {


  private List<Strategy> strategie;

  public And(Strategy... strategies) {
    strategie = new ArrayList<>();
    strategie.addAll(List.of(strategies));
  }

  @Override
  public boolean estValide(String mot) {
    for (Strategy strategy : strategie) {
      if (!strategy.estValide(mot)) {
        return false;
      }
    }
    return true;
  }
}
