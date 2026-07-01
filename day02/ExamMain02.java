package kr.ac.kopo.day02;

public class ExamMain02 {
    public static void main(String[] args) {
        // 5줄을 만들기 위한 바깥쪽 반복문
        for (int i = 0; i < 5; i++) {
            
            // 한 줄에 1부터 5까지 출력하기 위한 안쪽 반복문
            for (int j = 1; j <= 5; j++) {
                System.out.print(j); // 변수 j의 값(1~5)을 옆으로 출력
            }
            
            System.out.println(); // 한 줄이 끝나면 줄바꿈
        }
    }
}