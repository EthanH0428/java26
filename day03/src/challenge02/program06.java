package challenge02;

import java.util.Arrays;

public class program06 {
    public static void main(String[] args) {
        int junBe[] = new int[]{1, 9, 6, 8, 4}; // 정수형 배열 생성
        String StrBe[] = new String[]{"참새", "비둘기", "독수리", "부엉이", "갈매기"}; // 문자열 배열 생성
        System.out.println(Arrays.toString(reverse(junBe))); // reverse 메서드 호출하여 결과 출력
    }
    
    // 배열을 역순으로 반환하는 메서드
    // org: 원본 배열
    public static int[] reverse(int[] org) {
        int temp[] = new int[5]; // 역순으로 저장할 배열 생성
        // 원본 배열을 역순으로 temp 배열에 저장
        for (int i = 0; i < temp.length; i++) {
            for (int j = 4 - i; j >= 0; j--) {
                temp[i] = org[j]; // 원본 배열을 역순으로 temp 배열에 저장
                break; // 한 번만 저장하고 반복문 종료
            }
        }
        return temp; // 역순으로 된 배열 반환
    }
}