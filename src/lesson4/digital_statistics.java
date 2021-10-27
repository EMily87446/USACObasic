package lesson4;

import java.util.Scanner;

public class digital_statistics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        
        for(int i = n; i <= m; i ++){
        	
        	int k = i;
	    
        	while(k > 0) {
	    	
	    	if(k%10 == 2) {
            	cnt ++;
	            }
	    		k/=10;
	         }
	     }
        System.out.println(cnt);
	}
}

	
