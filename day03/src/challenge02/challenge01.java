package challenge02;

import java.util.Scanner;

public class challenge01{
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("학생[" + i + "]의 점수를 입력하세요: ");
            scores[i] = in.nextInt();
        }

        System.out.println("\n--- 성적 출력 ---");
        
        // for~each 문을 활용한 결과 출력
        int studentIndex = 0;
        for (int score : scores) {
            System.out.println("학생[" + studentIndex + "]의 점수: " + score);
            studentIndex++;
        }

    }
}
