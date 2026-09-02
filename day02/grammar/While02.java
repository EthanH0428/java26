package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = in.nextInt();
			if (true) {
				if (true) {
					if (num%2==0) {
						System.out.print(">> 짝수입니다.");
					}
					else {
						System.out.print(">> 홀수입니다.");
					}
				}
				int choies = 0;
				System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) :");
				choies = in.nextInt();
				if (choies == 0) {
					break;
				}
			}
			
		}
	}
}