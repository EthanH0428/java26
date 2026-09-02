package challenge;

public class program04 {
    public static void main(String[] args) {
        // 1번째 줄부터 5번째 줄까지 5번 반복
        for (int i = 1; i <= 5; i++) {
            
            //별의 개수; i만큼 반복해서 별을 찍습니다
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }

            System.out.println(); 
        }
    }
}