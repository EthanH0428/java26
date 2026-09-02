package challenge;

public class challenge03 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3, 5));
        System.out.println(factorial(10, 5));
    }

    static int factorial(int x) {
        int r = 1;
        //팩토리얼 값을 계산하는 코드
        while (x > 0) {
            r = r * x;
            x -= 1;
        }
        
        return r;
    }

    static int factorial(int x, int y) {
        int r = 1;
        //x부터 y까지 1씩 증가시키면서 곱하기
        for (int i = x; i <= y; i++) {
            r = r * i;
        }
        
        return r;
    }
}