package lesson2;

import java.util.Scanner;
import java.util.*;

public class Speed_drive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int road_length = 100;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int n_segment;
		int n_speed;
		int m_segment;
		int m_speed;
		Vector<Integer> road1 = new Vector<Integer>(1);
		Vector<Integer> road2 = new Vector<Integer>(1);
		int max = 0;
		
		for(int i = 1; i <= N; i ++) {
		
		    n_segment = sc.nextInt();
		    n_speed = sc.nextInt();
			
			for(int j = 0; j < n_segment; j++){
				road1.add(n_speed);
		}
		}
		
		for(int i = 1; i <= M; i ++) {
			
			m_segment = sc.nextInt();
			m_speed = sc.nextInt();	
			
			for(int j = 0; j < m_segment; j++) {
				road2.add(m_speed);
		}
		}
		
		for(int i = 0; i < 100; i++) {
			
			int chao = road2.get(i) - road1.get(i);
			
			if(chao > max) {
				
	
				max = chao;
				
			}
			
		}
		
		System.out.println(max);
		
			
			
		}
			
		
		
}
			
//3 3 
//40 75
//50 35
//10 45
//40 76
//20 30 
//40 40
		
		
	
	
	


	

