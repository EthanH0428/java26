package grammar;

import java.util.Scanner;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		for (int i=num; i>=1; i--) {
			for (int a=i-1; a>=1; a--) {
			System.out.print(' ');
			}
			for (int b=num; b>=i; b--) {
			System.out.print('*');
			}
			for (int b=num-1; b>=i; b--) {
			System.out.print('*');
			}
			System.out.println("");
		}
	}
}
