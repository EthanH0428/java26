package grammar;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("5개숫자를 입력하세요");
		int sum = 0;
		for (int i = 1; i <=5; i++) {	
			System.out.print("");
			int num = in.nextInt();
			sum += num;
		}
		System.out.print("5개 숫자의 합은 " + sum + "입니다");
	}
}