package net.zzw.datatype;

/**
 * 字符型
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/26 15:07
 * @since JDK11
 */
public class TestChar {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '中';
		char c3 = '\u0061';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		// 转义字符
		System.out.println("a\nb\nc\nd\n");
	}
}
