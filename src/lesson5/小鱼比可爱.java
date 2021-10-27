package lesson5;

import java.util.Scanner;

public class 小鱼比可爱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] know = new int [n];
		int [] rate = new int [n];
		for(int i = 0; i < n; i++) {
			rate [i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(rate[i] > rate[j]) {
					know[i]++;
				}
			}System.out.print(know[i] + " ");
		}
		
		
	}

}
