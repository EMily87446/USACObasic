package lesson8;
import java.util.*;

public class find_the_sum_of_factorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print(fac(n));
		
		}
	static int fac(int n) {
			int cnt = 0;
			int a = 1;
			
			for(int i = 1; i <= n; i++) {
				a *= i;
				cnt += a;
			}
		return cnt;
	}
	
}
