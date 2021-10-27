package lesson4;

import java.util.Scanner;

public class gold_coin {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int day = 0,x = 1, sum = 0;
		        while(day + x <= n){
		            day += x;
		            sum += x*x;
		            x ++;
		        }
		        sum +=(n - day)*x;
		        System.out.println(sum);
		    }
		
	}


