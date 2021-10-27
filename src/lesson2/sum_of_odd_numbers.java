package lesson2;

import java.util.Scanner;

public class sum_of_odd_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		int temp = a;
		while(temp <= b) {
			if(temp % 2 != 0) {
				sum += temp;
				
			}
			temp++;
		}
			
			
			System.out.println(sum);
		}
	}




