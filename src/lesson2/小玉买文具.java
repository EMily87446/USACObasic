package lesson2;

import java.util.Scanner;

public class 小玉买文具 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(0 <= a && a <= 10000) { 
			a *= 10;
			
		if(0 <= b && b <= 9) {
			
			int sum = (a + b)/19;
			System.out.println(sum);
			
			}
		}
				
	}

}
