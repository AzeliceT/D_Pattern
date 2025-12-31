import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin{

	@Override
	public Article creeArticle(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
