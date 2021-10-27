package lesson3;

import java.util.Scanner;

public class num_of_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int k = sc.nextInt();
		int k1 = 0;
		int k5 = 0;
		int k10 = 0;
		for(int i = 0; i < k; i ++) {
			int k_content = sc.nextInt();
			if(k_content == 1) {
				k1 ++;	
			}
			if(k_content == 5) {
				k5 ++;	
			}
			if(k_content == 10) {
				k10 ++;	
			}			
		}
		System.out.println(k1);
		System.out.println(k5);
		System.out.println(k10);
	}
}
