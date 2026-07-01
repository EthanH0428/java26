package kr.ac.kopo.day02;

public class ExamMain04 {
    public static void main(String[] args) {
        // 줄마다 시작 숫자를 결정할 바깥쪽 반복문 (1부터 5까지)
        for (int i = 1; i <= 5; i++) {
            
            // 한 줄에 5개의 숫자를 찍기 위한 안쪽 반복문 (0부터 4까지)
            for (int j = 0; j < 5; j++) {
                System.out.print(i + j); // 줄 번호(i)에 칸 번호(j)를 더해서 출력
            }
            
            System.out.println(); // 줄바꿈
        }
    }
}