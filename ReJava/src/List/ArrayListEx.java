package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		 List<String> LeageC = new ArrayList<String>();

		 LeageC.add("ž ����");
		 LeageC.add("�̵� �Ƹ�");
		 LeageC.add("�� ����");
		 LeageC.add("���� ���");
		 LeageC.add("���� ¥��");
		 LeageC.set(1, "�̵� ��þ�");//index 1�� �Ƹ��� ���� 
		 LeageC.remove(2); // index 2�� ���� ���� 
		 
		 for(String data:LeageC) {
			 System.out.println(data); // �ܼ� ���
		 }
		 System.out.println("����Ʈ ���"+LeageC.toString());
		 
	}

}
