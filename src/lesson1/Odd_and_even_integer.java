package lesson1;

import java.util.Scanner;

public class Odd_and_even_integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	
		if (x % 2 == 0 && x >= 0) {
			System.out.println("even");
		}
		else if(x >= 0) {
			System.out.println("odd");
		}

	}

}
