package lesson1;

import java.util.Scanner;

public class A_student_who_failed_a_course {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int language =sc.nextInt();
		int mathematics =sc.nextInt();
		
		if(language < 60 && mathematics >= 60|| mathematics < 60 && language >= 60) {
			System.out.println(1);
			
		}
		else {
			System.out.println(0);
		}
	}

}
