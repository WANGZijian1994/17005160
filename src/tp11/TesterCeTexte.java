package tp11;
import java.io.File;
public class TesterCeTexte {

	public static void main(String[] args) {
		File ft = new File("livres/adelaide.txt");
		Texte lt = new Texte(ft);
		lt.Afficher();       

	}

}
