package grammar;

import java.util.Scanner;

public class Star06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		for (int i=0; i<num; i++) {
			for (int a=0; a<i; a++) {
			System.out.print(' ');
			}
			for (int b=0; b<num-i; b++) {
			System.out.print('*');
			}
			for (int b=0; b<num-i-1; b++) {
			System.out.print('*');
			}
			System.out.println("");
		}
	}
}
