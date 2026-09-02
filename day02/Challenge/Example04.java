package homework;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s;
		System.out.print("초 단위 정수를 입력하세요 : ");
		s = in.nextInt();
		s = 2000%60;
		int m = 2000/60;
		int t = m/60;
		System.out.print(t+"시간 "+ m +"분 " + s + "초");
		
	}

}
