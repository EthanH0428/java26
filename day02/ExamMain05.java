package kr.ac.kopo.day02;

public class ExamMain05 {
    public static void main(String[] args) {
        // 줄마다 시작 숫자를 5부터 1까지 줄여나가는 바깥쪽 반복문
        for (int i = 5; i >= 1; i--) {
            
            // 한 줄에 5개의 숫자를 찍기 위한 안쪽 반복문 (0부터 4까지)
            for (int j = 0; j < 5; j++) {
                System.out.print(i + j); // 시작 숫자(i)에 칸 번호(j)를 더해서 출력
            }
            
            System.out.println(); // 줄바꿈
        }
    }
}
