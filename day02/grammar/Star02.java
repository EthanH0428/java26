package grammar;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		for (int i=num; i>=1; i--) {
			for (int a=i; a>=1; a--) {
			System.out.print('*');
			}
			System.out.println("");
		}
	}
}

