package challenge;

public class program08 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
    // 재귀 함수 이용
    static int factorial(int n) {
        // 화살표(->) case 레이블을 사용하는 switch 문입니다.
        switch (n) {
            case 0, 1 -> {
                // n이 0이거나 1이면 1을 반환하고 메서드를 즉시 종료합니다. (0! = 1, 1! = 1)
                return 1;
            }
        }
        
        // switch 문에서 걸러지지 않은 숫자들은 여기로 내려옵니다.
        // n * (n-1)! 을 계산하기 위해 자기 자신을 다시 호출합니다.
        // 예: n이 5라면 5 * factorial(4)를 반환합니다.
        return n * factorial(n - 1);
    }
}