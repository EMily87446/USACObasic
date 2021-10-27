package lesson3;

import java.util.Scanner;

public class Specified_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i ++) {
			int num = sc.nextInt();
		
		if(num == m) {
			cnt ++;
			}
		
		}
		
		System.out.println(cnt);
		
		

	}

}
