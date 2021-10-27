package lesson5;

import java.util.Scanner;

public class 校门外的数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		boolean [] tree = new boolean[l +1]; 
		for(int i = 1; i <= m; i ++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			for(int j = start; j <= end; j ++) {
				tree [j] = true;
			}
		}
		for(int h = 0; h <= l; h ++) {
			if(tree[h] == false) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
