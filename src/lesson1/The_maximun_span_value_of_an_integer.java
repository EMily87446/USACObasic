package lesson1;

import java.util.Scanner;

public class The_maximun_span_value_of_an_integer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int [] num1 = new int[length];
		
		for(int i = 0; i < length; i ++) {
		int num2 = sc.nextInt();
		num1[i] = num2;		
		}
		
		int max = num1[0];
		for(int i = 1; i < length; i ++) {
			if(num1[i] > max) {
			max = num1[i];
			}
		}
		
		int min = num1[0];
		for(int i = 1; i < length; i ++) {
			if(num1[i] < min) {
			min = num1[i];
			
		}
		}
		System.out.println(max - min);
		

		
		
		
		
		
		
		
	}
}

