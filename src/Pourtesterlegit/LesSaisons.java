package Pourtesterlegit;
import java.util.*;
public class LesSaisons {	
	Scanner clavier = new Scanner(System.in);	
	int mois = clavier.nextInt();

	public static void main(String[] args) {
		LesSaisons m = new LesSaisons();
		switch (m.mois) {
		case 2:
		case 3:
		case 4:
			System.out.println("Au printemps");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("En ижtиж");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("En automne");
			break;
		case 12:
		case 1:
			System.out.println("En hiver");
			break;
		default:
			System.out.println("Erreur");
			
		
		}

	}

}
