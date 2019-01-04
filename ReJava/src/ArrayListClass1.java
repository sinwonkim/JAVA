import java.util.ArrayList;

public class ArrayListClass1 {

	public static void main(String[] args) {
		
		ArrayList<String>  arr = new ArrayList<>();
		
		arr.add("하나");
		arr.add("넷");
		arr.add("둘");
		arr.add("셋");
		
		for(int i = 0 ; i<arr.size(); i++) { // 
			
			System.out.println(arr.get(i));
		}

	}

}
