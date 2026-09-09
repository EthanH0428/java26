package circle;

import java.util.Scanner;

public class CieArea {
	
	static int num = 10;
	
	public static void main(String[] args) {
		
		System.out.println(num);
		num = 100;
		System.out.println(num);
		//원의 반지름을 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름: ");
		double radius = sc.nextDouble();
		
		//Circle 객체 생성
		Circle c = new Circle(radius);
		
		//객체에 면적 계산 요청
		double area = c.getArea();
		
		//면적 출력
		System.out.printf("반지름이 %.2f인 원의 넓이는 %.2f입니다.\n", c.getRadius(), area);
		
		//객체 없이 원의 면적 구하기
		area = Circle.getArea(radius);
		System.out.printf("[static] 반지름이 %.1f인 원의 넓이는 %.2f 입니다.\n", radius, area);
		
	}

}
