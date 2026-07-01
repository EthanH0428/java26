package kr.ac.kopo.day02;

public class ExamMain07 {
    public static void main(String[] args) {
        // 5줄을 만들기 위한 바깥쪽 반복문
        for (int i = 1; i <= 5; i++) {
            
            // 1. 공백을 출력하는 반복문 (5 - i개)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            
            // 2. 별을 출력하는 반복문 (i개)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // 줄바꿈
        }
    }
}