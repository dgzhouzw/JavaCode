package net.zzw.datatype;

/**
 * 测试浮点型
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/26 15:00
 * @since JDK11
 */
public class TestFloatNumber {
	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 3.14E2;
		System.out.println(d1);
		System.out.println(d2);

		// 会报错，浮点数字面常量默认是double类型
		//float f1 = 1.65;
		// 正确
		float f1 = 1.65F;
		System.out.println(f1);

		// 浮点数是不精确的，建议不要进行比较
		float d3 = 0.1F;
		double d4 = 1.0 / 10;
		System.out.println(d4);
		System.out.println(d3 == d4);

		float f5 = 23432432443L;
		float f6 = f5 + 1;
		System.out.println(f5 == f6);
	}
}
