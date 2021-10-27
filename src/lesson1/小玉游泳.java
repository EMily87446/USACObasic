package lesson1;

import java.util.Scanner;

public class 小玉游泳 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int ans = 0;
		double step = 2; 
		double sum = 0;
		while( sum < x ) {
			ans ++;
			sum += step;
			step *= 0.98;
		}
		System.out.println(ans);
		
	}

}
