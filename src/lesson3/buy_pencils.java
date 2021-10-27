package lesson3;

import java.util.Scanner;

public class buy_pencils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int need = sc.nextInt();
		int sum;
		int min = 0;
		
		for(int i = 0; i < 3; i ++) {
			int pencil = sc.nextInt();
			int price = sc.nextInt(); 
			
			sum = 0; 
					
			min += sum;
			if(sum < min) {
				min = sum;
			}
			
			
			
		}
		System.out.println(min);
	}

}
