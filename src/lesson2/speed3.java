package lesson2;
import java.util.*;

public class speed3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Integer> road = new Vector<Integer>(10);
		 for(int i = 0; i < 100; i++) {
			 road.add(1);
		 }
		
		 for(int i = 0; i < road.size(); i++) {
			 System.out.print(road.get(i));
		 }
	}

}
