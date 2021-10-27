package lesson3;

import java.util.Scanner;

public class Olympic_medal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		int gold_sum = 0;
		int silver_sum = 0;
		int bronze_sum = 0;
		for (int i = 0; i < days; i ++) {
			
			int gold = sc.nextInt();
			int silver = sc.nextInt();
			int bronze = sc.nextInt();
		
			gold_sum += gold;
			silver_sum += silver;
			bronze_sum += bronze;
		}
		
		System.out.print(gold_sum + " ");
		System.out.print(silver_sum + " ");
		System.out.print(bronze_sum + " ");
		System.out.print(gold_sum + silver_sum + bronze_sum);		
	}

}
