package kr.ac.kopo.day02;

public class ExamMain11 {
    public static void main(String[] args) {
        int rows = 5;
        
        // i를 5부터 1까지 감소시키면서 처리
        for (int i = rows; i >= 1; i--) {
            // 1. 공백 출력 
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 2. 별 출력
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}