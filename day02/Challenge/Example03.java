package homework;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.print("원기둥의 밑면 반지름은? ");
		a = in.nextInt();
		System.out.print("원기둥의 밑면 반지름은? ");
		b = in.nextInt();
		double o = 3.14;
		double c = a*b*o;
		System.out.print("원기둥이 부피는 " + c);
	}

}
