package challenge;

import java.util.Scanner;

public class program03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 0으로 초기화
        int sum = 0; 
        int num; 
        
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = in.nextInt();
            
            // 입력받은 수가 양수이고, 동시에 짝수인지 확인
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
            
        // 양수일 동안만 반복
        } while (num > 0); 
        
        // 반복이 끝나면 누적된 합을 출력
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}