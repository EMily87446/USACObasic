
package lesson1;

import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		
		System.out.println("   *   ");
		System.out.println("  ***   ");
		System.out.println(" *****	");
		System.out.println("*******");
		System.out.println(" *****");
		System.out.println("  *** ");
		System.out.println("   * ");
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((double)a/b);
		
		int n =sc.nextInt();
		double sum = 0;
		for (int i = 1; i<n; i ++) {
			sum+= a;
			
			System.out.println(sum/n);
		
		
		}
		
		

	
	}
}
