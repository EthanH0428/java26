package kr.ac.kopo.day02;

public class ExamMain06 {
    public static void main(String[] args) {
        // 1줄부터 5줄까지 제어하는 바깥쪽 반복문
        for (int i = 1; i <= 5; i++) {
            
            // 현재 줄 번호(i)만큼만 별을 찍는 안쪽 반복문
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // 줄바꿈
        }
    }
}