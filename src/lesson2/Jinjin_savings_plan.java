package lesson2;

import java.util.Scanner;

public class Jinjin_savings_plan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int ans = 0;
		int jin = 0;
		int ma = 0;
		int left = 0;
		
		
		for(int i = 1; i <= 12; i ++) {
			
			int use = sc.nextInt();
			jin += 300;
			left += jin - use;
			
			
		if(left >= 100) {
			
			ma += 100*(left)/100;
			jin += left - (100*(left)/100);
			
		if( left < use) {
			
			System.out.println(-i);
			break;
		
		
		}
		else {
			ans = (int) (jin + ma*1.2);
			System.out.println(ans);
		}
		
		}
		
		
		
		
	}

}
}