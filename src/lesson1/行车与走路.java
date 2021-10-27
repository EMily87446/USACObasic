package lesson1;

import java.util.Scanner;

public class 行车与走路 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		double bike = 50 + n/3.0;
		double walk = n/1.2;
		if(bike == walk) {
			System.out.println("All");
			
		}
		else if(bike < walk) {
			System.out.println("Bike");
			
		}
		else{
			System.out.println("Walk");
		}

	}

}
