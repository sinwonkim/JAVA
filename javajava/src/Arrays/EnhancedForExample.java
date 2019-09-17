package Arrays;

public class EnhancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10,20,30,40,50};
		
		int sum = 0;
		for (int a : scores) {
			sum += a;
		}
		System.out.println(sum);
	}

}
