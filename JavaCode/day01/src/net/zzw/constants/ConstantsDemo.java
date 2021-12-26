package net.zzw.constants;

/**
 * 常量测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/26 14:38
 * @since JDK11
 */
public class ConstantsDemo {
	public static void main(String[] args) {
		final double PI = 3.1415;
		// PI = 3; 常量只能初始化一次

		double r = 3;
		// 圆面积
		double area = PI * r * r;
		// 圆周长
		double circle = 2 * PI * r;

		System.out.println("面积是: " + area);
		System.out.println("周长是: " + circle);
	}
}
