package lesson1;

import java.util.Scanner;

public class 最高的分数 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int max = 0;
		for(int i=1; i <= n; i++) 
		{
			int score =sc.nextInt();
			if(score>max) {
				max = score; 
				
			}
			
		}
		System.out.println(max);
	}

}
