public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<String,Integer> hash= new java.util.HashMap<String,Integer>();
		
		
		hash.put("�ѹ����", 30);
		hash.put("�ѹ��̽�", 20);
		hash.put("�ѹ���", 10);
		hash.put("�ѹ����", 40);
		
		System.out.println(hash.keySet());
	}

}
