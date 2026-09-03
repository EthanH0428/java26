package challenge02;

public class program07 {
    public static void main(String[] args) {
        // 주어진 배열들
        int a[] = {3, 2, 4, 1, 5};
        int b[] = {3, 2, 4, 1};
        int c[] = {3, 2, 4, 1, 5};
        int d[] = {2, 7, 1, 8, 2};

        // Return 메서드 호출 및 결과 출력
        Return(a, b);
        Return(a, c);
        Return(a, d);
        Return(b, c);
        Return(b, d);
        Return(c, d);
    }

    // 두 배열이 동일한지 검사하는 메서드
    // a, b: 비교할 두 배열
    public static void Return(int[] a, int[] b) {
        int count = 0; // 일치하는 원소의 개수를 저장할 변수 초기화

        // 배열의 길이가 동일한 경우에만 비교
        if (a.length == b.length) {
            // 각 위치에 대해 원소가 일치하는지 검사
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    count++; // 일치하는 경우 count 증가
                }
            }
        }
        
        // 배열의 모든 원소가 일치하는 경우 "같습니다." 출력, 그렇지 않으면 "다릅니다." 출력
        if (count == a.length) {
            System.out.println("같습니다.");
        } else {
            System.out.println("다릅니다.");
        }
    }
}