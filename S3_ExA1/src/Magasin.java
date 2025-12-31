import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
    private Map<String,Article> articles= new HashMap<String,Article>();
    public void ajouterArticle(String name, int anneeDeParution){
        Article article= this.creeArticle(name, anneeDeParution);
        articles.put(name,article);
    }

    public void result(){
       articles.forEach((k,v)->{ System.out.println(k+" "+v.getPrix());});
    }

    protected abstract Article creeArticle(String name, int anneeDeParution);
}
