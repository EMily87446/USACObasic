package lesson3;

import java.util.Scanner;

public class accumulation_of_numbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int m = sc.nextInt();
	int n = sc.nextInt();
	int sum = 0;
	
	for(int i = m; i <= n; i ++) {
		
		if(i%17 == 0) {
			sum += i;			
			}			
		}	
	System.out.println(sum);
	}

}
