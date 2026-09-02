package homework;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int input = in.nextInt();
		int a = input % 100;
		int b = a % 10;
		
		double p = 0.1;
		int a1 = (int) (input*p);
		int b1 = a1 % 10;
		
		double p1 = 0.01;
		int a2 = (int) (input*p1);
		int b2 = a2 % 10;
		
		int output = b+b1+b2;
		System.out.println(output);
		
	}

}
