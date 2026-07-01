package kr.ac.kopo.day02;

public class ExamMain10 {
    public static void main(String[] args) {
        int rows = 5; 
        
        for (int i = 1; i <= rows; i++) {
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