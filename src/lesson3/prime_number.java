package lesson3;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;// 因数个数
		for(int i = 2; i <= 100; i ++)
		
		for(int i = 2; i < Math.sqrt(n); i ++) {
			
			if(n % i == 0) {
				cnt ++;//如果n是i的倍数，n因数加一
			}

		}
		
		if(cnt == 0) {
			System.out.println("prime");
		}
		//
		else {
			System.out.println("not prime");
		}
			
	
	}
	
}
