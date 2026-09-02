package grammar;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		for (int i=1; i<=num; i++) {
			for (int a=1; a<=i; a++) {
			System.out.print('*');
			}
			System.out.println("");
		}
	}
}

