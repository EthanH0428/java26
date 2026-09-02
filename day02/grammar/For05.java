package grammar;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for (int i=2; i<=9; i++) {
			System.out.println("[ 구구단 " + i +"단 ]");
			for (int a=1; a<=9; a++) {
				System.out.println(i + " x " + a + " = " + (a*i));
			}
		}
	}
}
