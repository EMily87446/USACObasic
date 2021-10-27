package lesson6;

import java.util.*;

public class odd_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		int pos = 0;
		for(int i = 0; i < n; i++) {
			a [i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < n; i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]);	
				pos = i;
				break;
			}
		}
		for(int i = pos +1; i < n; i++) {
			if(a[i]%2!=0) {
			System.out.print("," + a[i]);	
			}
		}
	}
}
