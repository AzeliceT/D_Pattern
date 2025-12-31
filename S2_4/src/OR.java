import java.util.ArrayList;
import java.util.List;

public class OR implements Strategy {

  private List<Strategy> strategie;

  public OR(Strategy... strategies) {
    strategie = new ArrayList<>();
    strategie.addAll(List.of(strategies));
  }

  @Override
  public boolean estValide(String mot){
    for (Strategy strategy : strategie) {
      if (strategy.estValide(mot)) {
        return true;
      }
    }
    return false;
  }

}
