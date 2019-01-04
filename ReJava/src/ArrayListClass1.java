import java.util.ArrayList;

public class ArrayListClass1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		
		arr.add(40);
		arr.add(30);
		arr.add(10);
		arr.add(20);
		
		arr.set(2, 20);
		arr.set(3, 10);
		for(int e : arr) {
			System.out.println(e);
		}
		System.out.println(arr.size());
	}

}
