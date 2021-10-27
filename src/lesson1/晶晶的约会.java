package lesson1;

import java.util.Scanner;

public class 晶晶的约会 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n == 1 || n == 3 || n == 5) {
			System.out.println("NO");
		
		}
		else
		{
			System.out.println("YES");
		}
	}

}


