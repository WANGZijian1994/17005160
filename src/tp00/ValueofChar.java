package tp00;
import java.io.*;//����ײ���������������
public class ValueofChar {// char-->character

	public static void main(String[] args) {
		char ch = ' ';
		//�� ���������������� ��char���͵�
		// ˫������������ ��String���͵�
		// char����ʱ�õ����ţ�ֻ����һ����ĸ�����֡�char c='c';
		// ��String��˫���ţ�������һ����Ҳ�����Ƕ����ĸ�����ֵȡ�������ν���ַ�����String s="adsaf"
        // charֻ��һ���������ͣ���String ������һ���࣬����ֱ�����á�
		System.out.print("������һ���ַ���");
		try {
			ch = (char)System.in.read();//�Ӽ����Ͻ���һ���ַ����൱��Python�е�input()��Ȼ��ǿ��ת����char����ǿ�Ƹ�ֵ��ch
		}
		catch (IOException e)	{}
		System.out.println("�ַ�"+ch+"��ASCIIֵΪ��"+ (int) ch);
	}

}
