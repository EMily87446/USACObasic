package lesson4;

import java.util.Scanner;

public class numbers_nothing_do_with_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			int k = i;
			if(k % 7 == 0 || k%10 ==7 || (k/10)%10 == 7 ) { 
			continue;
			}
			
			cnt+=k*k;
		}
		System.out.println(cnt);

	}

}