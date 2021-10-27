package lesson3;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 2; i <= 100; i ++) {
			
			int cnt = 0;
			
			for(int j = 2; j <= Math.sqrt(i); j ++) {
					
				if(i % j == 0) {
					cnt ++;
					break;
				}
	
			}
			
			if(cnt == 0) {
				System.out.println(i);
			}
			
	
		}
	}

}
