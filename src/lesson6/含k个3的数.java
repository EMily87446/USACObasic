package lesson6;

import java.util.Scanner;

public class 含k个3的数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int cnt= 0;
		if(m%19==0) {
			while(m > 0) {
				if(m%10==3) {
					cnt++;
				}
				m/=10;
			}
		}
		if(cnt==n) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}
}
