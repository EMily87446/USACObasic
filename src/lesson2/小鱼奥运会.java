package lesson2;

import java.util.Scanner;

public class 小鱼奥运会 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int start = 0;
		int finish = 0;
		if(0 <= a) {
			a *= 60;
			
			if(0 <= b) {
			start += a + b;
			}
		}
		
		if(c <= 24) {
			c *= 60;
				
			if(d <= 60) {
			finish += c + d;
			}
		}
		
		int minute = finish - start;
		System.out.print(minute/60);
		System.out.print(" ");
		System.out.print(minute%60);
		
	}

	

}