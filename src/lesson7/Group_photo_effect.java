package lesson7;

import java.util.*;

import lesson7.Delineation_of_the_score_line.Applicants;

public class Group_photo_effect {
		
		static class Student{
				String gender;
				double height;
			Student(String gender, double height){
					this. gender= gender;
					this.height = height;
			}
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Student[] stu = new Student [n];
		for(int i = 0; i < n; i++) {
			stu[i] = new Student(sc.next(), sc.nextDouble());
			
		}
		Arrays.sort(stu,new Comparator<Student>() {
				public int compare(Student o1, Student o2) {
				if(o1.height > o2.height) {
					return 1;
				}
				else
					return -1;
			}		
		});
		for(int i = 0; i < n; i++) {
			if(stu[i].gender.equals("male")) {
				System.out.printf("%.2f",stu[i].height);
				System.out.print(" ");
			}
		}
		
		for(int i = n-1; i >= 0; i--) {
			if(stu[i].gender.equals("female")) {
				System.out.printf("%.2f", stu[i].height);
				System.out.print(" ");
			}
		}
	}

}

