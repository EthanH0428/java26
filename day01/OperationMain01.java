package kr.ac.kopop.day01;

/*
  두개의 정수(12, 5)의 산술연산을 출력하시오.
  12 + 5 =
 */

public class OperationMain01 {

	public static void main(String[] args) {
		
		int a = 30, b = 9;
		
		//System.out.println(a + " + " b + " = ");
		System.out.printf("%d + [%2d] = %d\n", a, b, a + b);
		System.out.printf("%d / [%-2d] = %.2f\n", a, b, (double)(a / b));
		System.out.printf("%d / %d = %.2f", a, b, (double)a / b);
	}

}
