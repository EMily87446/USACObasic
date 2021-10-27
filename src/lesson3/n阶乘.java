package lesson3;

import java.util.Scanner;

public class n阶乘 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i ++) {
			int x = 1;//i !
			
			for(int j = 1; j <= i; j ++) {
				
				x *= j;//<=i每一个阶乘
				
			}
			sum += x;//求阶乘和
			
		}
			System.out.println(sum);
	}

}
