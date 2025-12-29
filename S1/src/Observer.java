// Interface for strategy pattern to analyze lines of text
public interface Observer {


  void traiterLigne(String ligne);

  // Display the results of the analysis
  void result();

}
