package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		 List<String> LeageC = new ArrayList<String>();

		 LeageC.add("탑 스오");
		 LeageC.add("미드 아리");
		 LeageC.add("봇 베인");
		 LeageC.add("서폿 룰루");
		 LeageC.add("정글 짜오");
		 LeageC.set(1, "미드 루시안");//index 1번 아리를 변경 
		 LeageC.remove(2); // index 2번 베인 삭제 
		 
		 for(String data:LeageC) {
			 System.out.println(data); // 콘솔 출력
		 }
		 System.out.println("리스트 출력"+LeageC.toString());
		 
	}

}
