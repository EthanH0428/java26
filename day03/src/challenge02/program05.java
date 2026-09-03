package challenge02;

import java.util.Scanner;

public class program05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0~9부터 90~99까지 10개의 구간을 저장할 배열
        int[] histogram = new int[10];

        System.out.println("숫자를 10개 입력하세요.");
        
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            
            // 음수이거나 99를 초과하는 숫자는 무시 (0~99 범위만 처리)
            if (num >= 0 && num <= 99) {
                int index = num / 10;
                histogram[index]++;
            }
        }

        System.out.println(); 

        
        for (int i = 0; i < 10; i++) {
            int rangeStart = i * 10;
            int rangeEnd = rangeStart + 9;
            
            
            System.out.printf("%2d ~ %2d : ", rangeStart, rangeEnd);
            
            
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}