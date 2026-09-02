package challenge;

import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        // 입력한 정수 age에 저장
        int age = in.nextInt();
        
        // age가 19 이상인지 
        if (age >= 19) {
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }
    }
}