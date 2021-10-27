package lesson7;

import java.util.*;
public class 分数线划定 {

	static class Students{
		int id;
		int score;
		Students(int id, int score){
			this.id = id;
			this.score = score;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Students [] app = new Students [n];
		
		for (int i = 0; i < n; i++) {
			app[i] = new Students(sc.nextInt(), sc.nextInt());
			}
		int x = (int)(m * 1.5);
		Arrays.sort(app,new Comparator<Students>() {
			public int compare(Students o1,Students o2){
			if(o1.score != o2.score) {
				return o2.score - o1.score;
			}
			return o1.id - o2.id;
				}
			});
		int scoreline = app[x-1].score;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(app[i].score >= scoreline) {
				cnt++;
			}
		}
		System.out.println(scoreline + " " + cnt);
		for(int i = 0; i < cnt; i++) {
			System.out.println(app[i].id + " " + app[i].score);
		}
	}
}
