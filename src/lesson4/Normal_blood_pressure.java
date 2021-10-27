package lesson4;

import java.util.Scanner;

public class Normal_blood_pressure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < n; i ++) {
			int systolic = sc.nextInt();
			int diastolic = sc.nextInt();
			
			if(90 <= systolic && systolic <= 140 && 60 <= diastolic && diastolic <= 90) {
			cnt ++;
				}
			
				else { 
					max= Math.max(max, cnt);
					cnt = 0;
				}
			max = Math.max(max, cnt);
			}
			
			System.out.println(max);
		}
	}
