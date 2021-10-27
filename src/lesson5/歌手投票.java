package lesson5;

import java.util.Scanner;

public class 歌手投票 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int [11];
		int n = sc.nextInt();
		for(int i =1; i <= n; i ++) {
			int x = sc.nextInt();
			a[x]++;
		}
		for(int i = 1; i <= 10; i ++) {
			System.out.print(a[i] + " ");
		}

	}

}
