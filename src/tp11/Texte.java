package tp11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class Texte {
	private String Stexte;
    public Texte(File ft) {
		String ligne;
		Stexte = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne=br.readLine()) != null) {
				// ligne = ligne.split("\t")[0];
				Stexte += ligne + " ";
			}
			br.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
	}

	public void Afficher() {
		System.out.println(Stexte);
	}
	public int Chercher(String s) {
		return 0;
	}
	public void ChercherVoir(String s, int taille) {
		return;
	}

}
