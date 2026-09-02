package grammar;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("금액 : ");
		double total = in.nextDouble();
		System.out.println("< 동전의 수 >");
		int five = (int) (total/500);
		int one = (int) ((total%500)/100);
		
		System.out.println("500원 짜리 = " + five + "개");
		System.out.println("100원 짜리 = " + one + "개");
	}

}


