package tp5;

public class TestDePromotion {

	public static void main(String[] args) {
		Promotion i=new Promotion("2012-2016","Licence","Langue française","SDU","Chine");
		Promotion ii=new Promotion("2016-2018","Master","LFA-FLE","Sorbonne","France");
		Etudiant e=new Etudiant("WANG","Zijian",1994041815,'M',88.25,i);//Etudiant这里是对象而不是类。
		Etudiant e1=new Etudiant("WANG","Zijian",17005160,'M',14.3,ii);
		System.out.println(e);
		System.out.println(e1);

	}

}
