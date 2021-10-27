package lesson7;
import java.util.*;
public class 奖学金 {
	static class Student{
		int Chinese;
		int score;
		int id;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student [] stu = new Student[n];
		for(int i = 0; i < n; i++) {
			int Chinese = sc.nextInt();
			int Math = sc.nextInt();
			int English = sc.nextInt();
			stu[i] = new Student();
			stu[i].score = Chinese + Math + English;
			stu[i].Chinese = Chinese;
			stu[i].id = i + 1;
		}
		Arrays.sort(stu,new Comparator<Student>() {
			
			public int compare(Student o1,Student o2){				
				if(o1.score != o2.score) {
					return o2.score - o1.score;
				}
				if(o1.Chinese != o2.Chinese) {
					return o2.Chinese - o1.Chinese;
				}
				return o1.id - o2.id;
			}		
		});
		for(int i = 0; i < 5; i++) {
			System.out.println(stu[i].id + " " + stu[i].score);
		}
	}
}
