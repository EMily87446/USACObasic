package lesson1;

import java.util.Scanner;

public class Triangle_judgement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a-b<c && c-a<b && b-c<a) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			
		}
		

	}

}
