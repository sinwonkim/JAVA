package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashEx {
	
	public static void main(String[] args) {
		Map<String,String> hash = new HashMap<String,String>();
		
		hash.put("top", "리산드라");
		hash.put("mid", "야스오");
		hash.put("bottom","베인" );
		hash.put("jungle","신짜오");
		hash.put("support","룰루");
		
		System.out.println(hash.containsKey("top"));

		
		for(int i = 1; i <= hash.size(); i++) {
			System.out.println(hash.get(i));
		}	
		
	}
}
