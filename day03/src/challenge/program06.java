package challenge;

import java.util.Scanner;

public class program06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("철수 : ");
        String c = in.next();
        
        System.out.print("영희 : ");
        String y = in.next();
        
        // 문자열을 비교할 때는 == 대신 .equals() 메서드를 사용
        
        // 1. 철수와 영희가 같은 것을 냈을 경우
        if (c.equals(y)) {
            System.out.println("무승부!");
            
        // 2. 철수가 이기는 경우
        } else if ((c.equals("r") && y.equals("s")) || 
                   (c.equals("p") && y.equals("r")) || 
                   (c.equals("s") && y.equals("p"))) {
            System.out.println("철수, 승!");
            
        // 3. 영희가 이기는 경우
        } else {
            System.out.println("영희, 승!");
        }
    }
}