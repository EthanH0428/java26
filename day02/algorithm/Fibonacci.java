package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("Recursive : " + fiboRecursive(num));
		
		int[] memo = new int[num+1];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		if (num > 0) memo[1] = 1;
		System.out.println("Memorization : " + fiboMemorization(memo, num));
		System.out.println("Tabulation : " + fiboTabulation(num));

	}
	
	public static int fiboRecursive(int num) {
		if (num <= 0) return num;
		
		return fiboRecursive(num-1) + fiboRecursive(num-2);
	}
	
	public static int fiboMemorization(int[] memo, int num) {
		//미리 계산된 값이 없으면 계산하여 메모리에 저장
		if (memo[num] == -1) {
			memo[num] = fiboMemorization(memo, num-1) + fiboMemorization(memo, num-2) 
		}
		// 메모리에 저장된 값을 return
		return memo[num];
	}
	
	public static int fiboTabulation(int num) {
		int[] table = new int[num+1];
		Arrays.fill(table, 0);
		if (num > 0) table[1] = 1;
		for(int i = 2; i <= num; i++) {
			table[i] = table[i-1] + table[i-2]
		}
		return table[num];
	}
	
}
