package challenge02;

import java.util.Scanner;

public class program04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("URL을 입력하세요 : ");
            String url = scanner.nextLine();

            // 'bye' 입력 시 프로그램 종료
            if (url.equalsIgnoreCase("bye")) {
                break;
            }

            // 'com'으로 끝나는지 검사
            if (url.endsWith("com")) {
                System.out.println(url + "은 'com'으로 끝납니다.");
            }

            // 'java'를 포함하는지 검사
            if (url.contains("java")) {
                System.out.println(url + "은 'java'를 포함합니다.");
            }
        }
        
    }
}