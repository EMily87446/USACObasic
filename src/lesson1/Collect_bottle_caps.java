package lesson1;

import java.util.Scanner;

public class Collect_bottle_caps {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int lucky =sc.nextInt();
		int encouragement = sc.nextInt();
		
		if(lucky >= 10 || encouragement >= 20) {
			System.out.println(1);
			
		}
		else {
			System.out.println(0);
		}
	}

}
