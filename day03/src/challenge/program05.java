package challenge;

public class program05 {
    public static void main(String[] args) {
        // 변 a, b, c를 1부터 19까지 반복
        for (int a = 1; a < 20; a++) {
            for (int b = 1; b < 20; b++) {
                for (int c = 1; c < 20; c++) {
                    
                    // 세 변의 합이 20 이하
                    if ((a * a + b * b == c * c) && (a + b + c <= 20)) {
                        
                        // (3, 4, 5)와 (4, 3, 5)는 같은 삼각형
                        // a가 b보다 작거나 같은 경우만 출력
                        if (a <= b) {
                            System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
                        }
                    }
                }
            }
        }
    }
}