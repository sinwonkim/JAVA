package Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] scores = new int[] {30,20,40,50};
		// scores = new int[] {30,20,40,50};
		
		int[] scores = new int[] {30,20,40,50};
		int[] Aclass = {30,40,50,60};
		
		/*for(int i = 0; i < Aclass.length; i++) {
			System.out.println(scores[i]);
		}*/
		
		int sum = add(new int[] {80,90,100});
		System.out.println(sum);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
