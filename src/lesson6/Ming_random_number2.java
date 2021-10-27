package lesson6;

import java.util.Scanner;

public class Ming_random_number2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] cnt = new int [1001];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			cnt[x]++;
		
			}
		
		for(int i = 1; i <= 1000; i++) {
			for(int j = 1; j <= cnt[i];j++) {
				System.out.print(i + " ");
				}
			}
		}
	}

