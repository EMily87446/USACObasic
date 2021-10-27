package lesson6;

import java.util.Scanner;

public class Ming_random_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] cnt = new int [1001];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			cnt[x]++;
			if(cnt[x] == 1) {
			ans ++;
			}
		}
		System.out.println(ans);
		for(int i = 1; i <= 1000; i++) {
			if(cnt[i] > 0) {
				System.out.print(i + " ");
			}
			
		}

	}

}
