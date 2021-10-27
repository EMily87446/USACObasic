package lesson2;

import java.util.Scanner;

public class 津津学习 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int ans = 0;
		int max = 0;
		
		for(int i = 1; i <= 7; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a + b > max) {
				max = a + b;
				ans = i;
				}
			
		}
		
		System.out.println(ans);
		
		

	}

}
