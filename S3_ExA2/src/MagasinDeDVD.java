public class MagasinDeDVD  implements AbstractFactory{

	@Override
	public Article ajouterArticle(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}
