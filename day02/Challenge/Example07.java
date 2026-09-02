package homework;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int input = in.nextInt();
		System.out.println(input%4 == 0 && input%5 == 0);
		System.out.println(input%4 == 0 || input%5 == 0);
		System.out.println((input%4 == 0 || input%5 == 0)&&(input%4 != 0 && input%5 != 0));
	}

}
