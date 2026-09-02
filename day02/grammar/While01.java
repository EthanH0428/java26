package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(true) {
			if (true) {
			System.out.print("숫자를 입력하세요 : ");
			num = in.nextInt();
			}
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다");
		
		}
		
	}
