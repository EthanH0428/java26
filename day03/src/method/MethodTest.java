package method;

import java.util.Arrays;

public class MethodTest {

    public static void main(String[] args) {
        int[] numArr = {3, 6, 2, 4, 8};

        System.out.println("getSum의 결과값 = " + getSum(numArr));
        
        System.out.println("getMax의 결과값 = " + getMax(numArr));
        System.out.println("getCount(4보다 큰 수)의 결과값 = " + getCount(numArr, 4));
        
        int[] reversed = swapArray(numArr);
        System.out.println("swapArray의 결과값 = " + Arrays.toString(reversed));
    }

    public static int getSum(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }

    public static int getMax(int[] numArr) {
        int max = numArr[0];
        // 배열을 순회하며 현재 max보다 큰 값이 있으면 갱신
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        return max;
    }

    public static int getCount(int[] numArr, int target) {
        int count = 0;
        // 배열을 순회하며 target보다 큰 숫자가 나올 때마다 count 증가
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > target) {
                count++;
            }
        }
        return count;
    }

    public static int[] swapArray(int[] numArr) {
        int[] reverseArr = new int[numArr.length];
        // 배열의 끝 인덱스부터 처음 인덱스까지 역순으로 새 배열에 저장
        for (int i = 0; i < numArr.length; i++) {
            reverseArr[i] = numArr[numArr.length - 1 - i];
        }
        return reverseArr;
    }
}