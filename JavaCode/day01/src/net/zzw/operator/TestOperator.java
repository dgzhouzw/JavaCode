package net.zzw.operator;

/**
 * 三元运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/26 15:38
 * @since JDK11
 */
public class TestOperator {
	public static void main(String[] args) {
		int score = 90;
		String str = score < 60 ? "不及格" : "合格";
		System.out.println(str);

		int x = -100;
		int flag = x > 0 ? 1 : (x == 0 ? 0: -1);
		System.out.println(flag);
	}
}
