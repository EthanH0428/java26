package kr.ac.kopo.day02;

public class ExamMain09 {
    public static void main(String[] args) {
        //  1~5줄: 단순히 i개만큼 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //  6~9줄 (4줄 분량): 줄이 갈수록 공백이 늘어나고 별은 줄어듦
        // i는 별의 개수 (4개부터 1개까지 감소)
        for (int i = 4; i >= 1; i--) {
            // 공백 출력 (4-i개만큼)
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (i개만큼)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
