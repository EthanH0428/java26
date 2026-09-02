package challenge;

import java.util.Scanner;

public class program07 {
    static Scanner in = new Scanner(System.in);
    
    // 매개변수로 이름을 받아서 프롬프트를 띄우고, 입력받은 문자열을 반환합니다.
    public static String input(String name) {
        System.out.print(name + " : ");
        return in.next();
    }
    
    // 승패 판별을 담당하는 메서드
    public static void whosWin(String c, String y) {
        if (c.equals(y)) {
            System.out.println("무승부!");
        } else if ((c.equals("r") && y.equals("s")) || 
                   (c.equals("p") && y.equals("r")) || 
                   (c.equals("s") && y.equals("p"))) {
            System.out.println("철수, 승!");
        } else {
            System.out.println("영희, 승!");
        }
    }

    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        
        // 승패판별 및 출력
        whosWin(c, y);
    }
}