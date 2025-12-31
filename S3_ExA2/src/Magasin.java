import java.util.HashMap;
import java.util.Map;

public class Magasin {
    private Map<String,Article> articles= new HashMap<String,Article>();

    private AbstractFactory factory;

    public Magasin(AbstractFactory factory) {
        this.factory = factory;
    }

    public void ajouter(String name, int anneeDeParution){
        Article article= factory.ajouterArticle(name, anneeDeParution);
        articles.put(name,article);
    }

    public void result(){
       articles.forEach((k,v)->{ System.out.println(k+" "+v.getPrix());});
    }

}
