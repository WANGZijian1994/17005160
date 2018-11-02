package tp00;
import java.io.*;//引入底层类库输入输出流。
public class ValueofChar {// char-->character

	public static void main(String[] args) {
		char ch = ' ';
		//‘ ’单引号引的数据 是char类型的
		// 双引号引的数据 是String类型的
		// char定义时用单引号，只能有一个字母，数字。char c='c';
		// 而String用双引号，可以是一个，也可能是多个字母，汉字等。就是所谓的字符串。String s="adsaf"
        // char只是一个基本类型，而String 可以是一个类，可以直接引用。
		System.out.print("请输入一个字符：");
		try {
			ch = (char)System.in.read();//从键盘上接受一个字符，相当于Python中的input()，然后强制转换成char类型强制赋值给ch
		}
		catch (IOException e)	{}
		System.out.println("字符"+ch+"的ASCII值为："+ (int) ch);
	}

}
