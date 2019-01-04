public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<String,Integer> hash= new java.util.HashMap<String,Integer>();
		
		
		hash.put("넘버삼십", 30);
		hash.put("넘버이십", 20);
		hash.put("넘버십", 10);
		hash.put("넘버사십", 40);
		
		System.out.println(hash.keySet());
	}

}
