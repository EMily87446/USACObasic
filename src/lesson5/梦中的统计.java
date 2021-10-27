package lesson5;

import java.util.Scanner;

public class 梦中的统计 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ans = new int[11];
		for(int i = n; i <= m; i++) {
			int k = i;
			while(k > 0) {
				int num = k % 10;
				k/=10;	
				ans[num] ++;
				}
			}
			for(int i = 0; i < 10; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
