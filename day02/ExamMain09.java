package kr.ac.kopo.day02;

public class ExamMain09 {
    public static void main(String[] args) {
        
        // 1줄부터 5줄까지: 별이 1개에서 5개로 늘어남
        for (int i = 1; i <= 5; i++) {
            // 1. 공백 출력 (5 - i개)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 2. 별 출력 (i개)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
        
        // 6줄부터 9줄까지: 별이 4개에서 1개로 줄어듦
        // i는 별의 개수 (4부터 1까지 감소)
        for (int i = 4; i >= 1; i--) {
            // 1. 공백 출력 (5 - i개)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 2. 별 출력 (i개)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}