public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<String,Integer> hash= new java.util.HashMap<String,Integer>();
		
		
		hash.put("넘버삼십", 30);
		hash.put("넘버이십", 20);
		hash.put("넘버십", 10);
		hash.put("넘버사십", 40);
		
		System.out.println(hash.keySet()); // keySet메소드는 해당 맵에 포함된 모든 키 값들을 하나의 집합(set)으로 반환해주는 역할 
	}

}
