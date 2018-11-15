package tp5;

public class Promotion {
private String annee,specialite,diplome,universite,pays;

public Promotion (String a,String d,String s,String u,String p) {
	annee=a;
	diplome=d;
	specialite=s;
	universite=u;
	pays=p;
}
public String annee() {return annee;}
public String diplome() {return diplome;}
public String specialite() {return specialite;}
public String universite() {return universite;}
public String pays() {return pays;}
}
