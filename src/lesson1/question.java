package lesson1;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = 0;
		double sn = 0;
		while (sn <= k) {
			n ++;
			sn += 1.0/n;
		}
		System.out.println(n);
		
	}

}
