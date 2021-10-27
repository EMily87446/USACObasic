package lesson1;

import java.util.Scanner;

public class Divisible_by_3_and_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n %3 == 0 && n %5 ==0 && -1000000 < n && n < 1000000) {
			
			System.out.println("YES");
				
		}
		else {
			System.out.println("NO");
		}
	}

}
