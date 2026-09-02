package challenge;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        // isPrime 메서드에 num을 넣어 소수인지 아닌지(true/false) 확인합니다.
        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }
    
    // 특정 숫자 n이 소수인지 판별하여 true 또는 false를 반환하는 메서드입니다.
    static boolean isPrime(int n) {
        // 1 이하는 소수가 아니므로 무조건 false를 반환합니다.
        if (n <= 1) {
            return false;
        }
        
        // 2부터 n의 제곱근까지만 나눠보아도 소수인지 알 수 있습니다.
        // 1과 자기 자신 외에 나누어 떨어지는 수가 있는지 검사합니다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // 한 번이라도 나누어 떨어지면 소수가 아니므로 false를 반환합니다.
                return false;
            }
        }
        // 반복문이 끝날 때까지 나누어 떨어지는 수가 없었다면, 소수이므로 true를 반환합니다.
        return true;
    }
}