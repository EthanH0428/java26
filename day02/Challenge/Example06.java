package homework;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("화씨온도를 입력하시오 : ");
		double F = in.nextDouble();
		double fivenine = (double) 5/9;
		double C = (fivenine)*(F-32);
		System.out.println("섭씨온도 : " + C);
	}
}
