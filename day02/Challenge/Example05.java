package homework;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch1 = 'c';
		int asc = (int) ch1;
		char CH = 'C';
		int ASC = (int) CH;
		int d = asc - ASC;
		
		int Casc = asc - d;
		char asc2 = (char) Casc;
		
		System.out.print(asc2);
	}

}