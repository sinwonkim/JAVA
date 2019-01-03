
public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] +=10;
		}
		
		for(int b : arr) {
			System.out.println(" 배열 arr의 값은" + b +" 이다.");
		}
	}
}
