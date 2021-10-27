package lesson3;

import java.util.Scanner;

public class age_and_disease {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double cnt1 = 0;
		double cnt2 = 0;
		double cnt3 = 0;
		double cnt4 = 0;
				
		for (int i = 1; i <= n; i ++) {
			int age = sc.nextInt();
			
			if(0 <= age && age <= 18) {
			cnt1 ++;
						}	
			
			if(19 <= age && age <= 35) {
				cnt2 ++;
						}
			if(36 <= age && age <= 60) {
				cnt3 ++;
					}
			if(age >= 61) {
				cnt4 ++;
				}
		}
		double percent1 = (double)(cnt1/n)*100;
		double percent2 = (double)(cnt2/n)*100;
		double percent3 = (double)(cnt3/n)*100;
		double percent4 = (double)(cnt4/n)*100;
		
		System.out.printf("%.2f", percent1 )+ "%");
		System.out.println(
				String.format("%.2f", percent2 )+ "%");
		System.out.println(
				String.format("%.2f", percent3 )+ "%");
		System.out.println(
				String.format("%.2f", percent4 )+ "%");
	}
}
