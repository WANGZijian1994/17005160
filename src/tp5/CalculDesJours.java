package tp5;
import tp5.Date;
public class CalculDesJours {

	public static void main(String[] args) {
		Date fete = new Date(14,7,2019);//Date类初始一个fete对象
		Date aujourdhui=new Date();//aujourdhui是Date的一个类对象，引用Date类里面Date()方法
		int nbdejours=0;
		while (fete.CompareTo(aujourdhui)==true) {//类对象.方法（参数）
			nbdejours++;
			aujourdhui.Incrementer();
			
		}
		System.out.println("le nombre de jours est "+nbdejours);

	}

}
