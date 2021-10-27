package lesson5;

import java.util.Scanner;

public class 小鱼数学游戏 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int [] a = new int[101];
		while(true) {
			int x = sc.nextInt();
			if(x ==0) {
				break;
			}
			else {
				a [cnt] = x;
			}
			cnt ++;
		}
		for(int i = cnt-1; i >= 0; i --) {
			System.out.print(a[i] + " ");
		}
	}

}
