package lesson8;
import java.util.*;
public class 自定义方法 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		fun(10,20);
//		int x = bad(10,20);
//		System.out.print(x);
		
		int ans = jie(5);
		System.out.print(ans);
		
	}
//		static void fun(int n, int m)
//		{
//			for(int i = n; i <= m; i++) {
//				System.out.print(i + " ");
//	}
//}
//
//		
//		static int bad(int a, int b)
//		{
//			return a + b;
//				
//	}
	
	static int jie(int n)
	{
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
		
