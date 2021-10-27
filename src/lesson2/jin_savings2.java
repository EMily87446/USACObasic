package lesson2;

import java.util.Scanner;

public class jin_savings2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int jin = 0;
		int ma = 0;
		
		for(int i = 1; i <= 12; i ++) {
			
			jin += 300;
			int use = sc.nextInt();
			jin -= use;
			
			
		while(jin >= 100) {
				
			ma += (jin / 100*100);
			jin -= (jin / 100*100);				
				
			}
		
			if(jin < 0){
			
			System.out.println(-i);
			return;
				
			}
			
		}
	
		int ans = (int)(jin + ma * 1.2);
		System.out.println(ans);
		
	}

}
