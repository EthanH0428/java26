package homework;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하시오 : ");
		num = in.nextInt();
		int numnum = num*num;
		System.out.print(num + "의 제곱은 " + numnum);
	}

}
