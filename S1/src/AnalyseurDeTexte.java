import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalyseurDeTexte {

	List<Observer> observerList;

	public AnalyseurDeTexte(Observer... observers) {
		observerList = new ArrayList<>();
		observerList.addAll(Arrays.asList(observers));
	}

	public void lireFichier(File f) throws IOException {
		BufferedReader lecteurAvecBuffer;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
			return;
		}

		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			String ligneFinale = ligne.toLowerCase();

			for (Observer observer : observerList) {
				observer.traiterLigne(ligneFinale);
			}
		}

		lecteurAvecBuffer.close();

		for (Observer observer : observerList) {
			observer.result();
		}

	}
}
