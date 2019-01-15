package Examen19Exercice3;

public class Exercice3 {
	public boolean StartEnd (String target,String str) {
		boolean flag=false;
		boolean flag1=str.startsWith(target);
		boolean flag2=str.endsWith(target);
		if(flag1==true && flag2==true) {
			flag=true;
		}
		return flag;}
	public boolean Miroir(String str) {
		boolean flag=false;
		int cpt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				cpt++;
			}
		}
		if(cpt==str.length()) {
			flag=true;
		}
		return flag;
	}
	public boolean Anagramme(String str1,String str2) {
		boolean flag=false;
		int cpt=0;
		if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			String s = String.valueOf(str1.charAt(i));
			if(str2.contains(s)){
				cpt++;
			}
		}
		if(cpt==str1.length()) {
			flag=true;
		}
		
		}
		return flag;
	}
	public static void main(String[] args) {
		Exercice3 e = new Exercice3();
		System.out.println(e.StartEnd("e","echange"));//true
		System.out.println(e.StartEnd("f", "esprit"));//false
        System.out.println(e.Miroir("ABBA"));//true
        System.out.println(e.Miroir("azeyeb"));//false
        System.out.println(e.Anagramme("parisien", "aspirine"));//true
	}

}
