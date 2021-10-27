package lesson5;

import java.util.Scanner;

public class calculate_book_feed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] price = {28.9,32.7,45.6,78,35,86.2,27.8,43,56,65};
		double cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			cnt += number * price[i];
		}
		System.out.printf("%.1f", cnt);
	}

}
