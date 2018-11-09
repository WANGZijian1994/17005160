package Pourtesterlegit;

public class test1 {

	public static void main(String[] args) {
		final int SIZE = 97;
		char ch = 'A';
		char sh = 'a';
		short i = (short) ch;
		short m = (short) sh;
		if (i==SIZE) {System.out.println(ch + " en ASCII:" + SIZE);}
		else System.out.println(sh + " en ASCII:"+ m);
		String alphabet = "abcdefg";
		for (int k=0;k<alphabet.length();k++) {System.out.println(alphabet.charAt(k)+" en ASCII:"+(int) alphabet.charAt(k));}
  
	}

}
