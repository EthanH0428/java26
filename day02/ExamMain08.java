package kr.ac.kopo.day02;

public class ExamMain08 {
    public static void main(String[] args) {
        // 1개부터 5개까지 늘어나는 부분 (1~5줄)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 4개부터 1개까지 줄어드는 부분 (6~9줄)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}