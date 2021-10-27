package lesson8;

import java.util.*;

public class buy_pencils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int need = sc.nextInt();
		int sum;
		int min = 0;
		int x = buy(sc.nextInt(), 0, 0, sc.nextInt(), sc.nextInt());
		System.out.println(x);
	}
	static int buy(int need, int sum, int min, int pencil, int price) {
		
		for(int i = 0; i < 3; i ++) {
			
			sum = (int)Math.ceil((double)need/pencil) * price; 
					
			min += sum;
			if(sum < min) {
				min = sum;
			}
		
	}
		return min;

	}
}
