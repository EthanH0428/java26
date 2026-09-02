package grammar;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		System.out.println("[ 구구단 " + num +"단 ]");
		for (int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
}