package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashEx {
	
	public static void main(String[] args) {
		Map<String,String> hash = new HashMap<String,String>();
		
		hash.put("top", "������");
		hash.put("mid", "�߽���");
		hash.put("bottom","����" );
		hash.put("jungle","��¥��");
		hash.put("support","���");
		
		System.out.println(hash.containsKey("top"));

		
		for(int i = 1; i <= hash.size(); i++) {
			System.out.println(hash.get(i));
		}	
		
	}
}
