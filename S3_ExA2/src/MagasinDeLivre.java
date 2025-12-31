public class MagasinDeLivre implements AbstractFactory{

	@Override
	public Article ajouterArticle(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
