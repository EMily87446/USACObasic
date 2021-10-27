package lesson4;

import java.util.Scanner;

public class Tao_pick_apples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] apple_height = new int [11];
		int cnt = 0;
		
		for(int i = 0; i < 10; i ++) {
			apple_height[i] = sc.nextInt();
		}
		int tao_height = sc.nextInt();
		tao_height += 30;
		
		for(int i = 0; i < 10; i ++) {
			if(tao_height >= apple_height[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
