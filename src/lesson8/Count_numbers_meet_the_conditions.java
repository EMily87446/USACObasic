package lesson8;
import java.util.*;
public class Count_numbers_meet_the_conditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = 0;
		int sum = 0; 
		int cnt = 0;
		for ( int i = 0; i < n; i++) {
			int four = sc.nextInt();}
		
		System.out.print(condition(cnt));
		
	}
	static int condition(int n, int cnt, int digit, int sum, int four) {
		for ( int i = 0; i < n; i++) {
				digit = four%10;
				for (int j = 0; j < 3; j++) {
					four /= 10;
					sum += four % 10;
				}
				if(digit > sum) {
					cnt ++;
				}
		}
		return cnt;
	}

}
