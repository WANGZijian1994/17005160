package tp5;
import tp5.Date;
public class CalculDesJours {

	public static void main(String[] args) {
		Date fete = new Date(14,7,2019);//Date���ʼһ��fete����
		Date aujourdhui=new Date();//aujourdhui��Date��һ�����������Date������Date()����
		int nbdejours=0;
		while (fete.CompareTo(aujourdhui)==true) {//�����.������������
			nbdejours++;
			aujourdhui.Incrementer();
			
		}
		System.out.println("le nombre de jours est "+nbdejours);

	}

}
