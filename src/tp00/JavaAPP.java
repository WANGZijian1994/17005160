package tp00;
import java.util.*;// import导入类库,util----Java数据结构类。
import java.io.*;//import Java输入输出类。
public class JavaAPP {//public class是对主类的声明，JavaAPP是主类的名字（本程序的名字，以.java后缀来保存 {}类的开始和结束。注意每个应用程序只有一个公共类。一般把包含有void main{}的class当作公共类。

	public static void main(String[] args) {//meng方法。传入一个string类型的数组+arg（名字可变）
		System.out.println("Bonjour le monde");
		int i = 10;
		System.out.print("i=");
		System.out.println(i);
        int b =12;
        System.out.println("b="+b);
	}

}
// IDE ---Integrated Development Environment 
// Java跨平台：字节码，Java程序编译后生成*.class文件，这种目标代码成为字节码。可以直接携带这个装载程序源代码的字节码class文件到任意一个平台执行Java程序。
// 字节码文件是结构中立的，它和计算机平台（操作系统无关）。即任何安装了Java运行环境（JVM）的计算机都能执行这种代码。
// classpath permet de 执行Java底层类库。比如io, utility,或者其他的数据库方面的基础类库
// 