package tp5;

public class Etudiant {
private String nom,prenom;
private long numeroDEtudiant;
private char genre;
private double moyenne;
private Promotion formation;

public Etudiant(String n,String p,long nb,char g, double m,Promotion f) {
	nom=n;
	prenom=p;
	numeroDEtudiant=nb;
	genre=g;
	moyenne=m;
	formation=f;
	}
public String nom() {return nom;}//变量名不能重复，但是定义的变量名可以被用作类名。
public String prenom() {return prenom;}
public long numeroDEtudiant() {return numeroDEtudiant;}
public char genre() {return genre;}
public double moyenne() {return moyenne;}
public Promotion form() {return formation;}
}
