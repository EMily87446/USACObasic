package lesson7;
import java.util.*;
public class 成绩排序2{
		static class Student
		{
			String name;
			int score;
			Student(String name, int score) {
				this.name = name;
				this.score = score;
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Student [] stu = new Student[n];
			for(int i = 0; i < n; i++) {
				
				stu[i] = new Student(sc.next(),sc.nextInt());
				stu[i] score
			}
			Arrays.sort(stu,new Comparator<Student>() {
				
				public int compare(Student o1,Student o2)
				{				
					if(o1.score != o2.score) {
					return o2.score - o1.score;
					}
					return o1.name.compareTo(o2.name);
//					return o2.score - o1.score;
				}
				
			});
			for(int i = 0; i < n; i++) {
			System.out.println(stu[i].name + " " + stu[i].score);
			}
		}

	}
