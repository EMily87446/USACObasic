package lesson1;

import java.util.Scanner;

public class if_test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n >= 10 && n <= 99) {
			System.out.println(1);
		
		}
		else
		{
			System.out.println(0);
		}
	}

}
