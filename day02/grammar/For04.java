package grammar;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		while (true) {
		if (true){
			System.out.print("양의 숫자를 입력하세요 : ");
			num = in.nextInt();
			if (num>0) {
				break;
			}
			}
		if (num<0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			num = in.nextInt();
			if (num>0) {
				break;
			}
			}
		}
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.print("1부터 " + num + "까지의 합은 "+ sum +"입니다");
	
}
}

