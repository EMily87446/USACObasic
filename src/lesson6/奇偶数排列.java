package lesson6;

import java.util.*;

public class 奇偶数排列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int [10];
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();	
		}
		Arrays.sort(a);
		for(int i = 10-1; i >= 0; i--) {
			if(a[i]%2!=0) {
				System.out.print(a[i] + " ");
			}
		}
		for(int i = 0; i < 10; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i] + " ");
			}
		}
	}	
}
