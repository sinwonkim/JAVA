import java.util.ArrayList;

public class ArrayListClass1 {

	public static void main(String[] args) {
		
		ArrayList<String>  arr = new ArrayList<>();
		
		arr.add("�ϳ�");
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		for(int i = 0 ; i<arr.size(); i++) { // 
			
			System.out.println(arr.get(i));
		}

	}

}
