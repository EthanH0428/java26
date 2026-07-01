package kr.ac.kopo.day02;

public class ExamMain03 {
    public static void main(String[] args) {
        // 1부터 5까지 줄 번호를 통제하는 바깥쪽 반복문
        for (int i = 1; i <= 5; i++) {
            
            // 한 줄에 5칸씩 똑같은 숫자를 채우는 안쪽 반복문
            for (int j = 0; j < 5; j++) {
                System.out.print(i); // 현재 줄 번호인 변수 i의 값을 출력
            }
            
            System.out.println(); // 한 줄이 끝나면 줄바꿈
        }
    }
}