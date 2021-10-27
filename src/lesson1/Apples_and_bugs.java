package lesson1;

import java.util.Scanner;

public class Apples_and_bugs {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y <= n * x) { 
			int whole = n - (int) Math.ceil((double)y/x);
			
			System.out.println(whole);
			
			
			}
			
			
			
	

}
	
}
