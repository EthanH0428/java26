package challenge;

import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("등수를 입력하세요: ");
        // 입력한 등수 rank에 저장
        int rank = in.nextInt();
        
        switch (rank) {
            case 1:
                // 1등일 경우
                System.out.println("아주 잘했습니다");
                break; // 출력이 끝났으니 switch 문을 빠져나갑니다.
                
            case 2:
            case 3:
                // 2등이거나 3등일 경우 
                System.out.println("잘했습니다");
                break;
                
            case 4:
            case 5:
            case 6:
                // 4, 5, 6등 중 하나일 경우
                System.out.println("보통입니다");
                break;
                
            default:
                // 위 case에 해당하지 않는 모든 등수 (7등 이하 등) 
                System.out.println("노력해야겠습니다");

        }
    }
}