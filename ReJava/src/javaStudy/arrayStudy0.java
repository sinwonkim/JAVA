package javaStudy;

public class arrayStudy0 {
	
	public static void main(String[] args) {
		
		String[] lolC = new String[5];
		lolC[0] = "ž: �߽���";
		lolC[1] = "�̵�: ����";
		lolC[2] = "����: ����";
		lolC[3] = "����: �˸���Ÿ";
		lolC[4] = "����: ����";
		
		//������� �������¡  �ٸ� ������� �迭�� �����
		
		String[] lolC2 = {"ž: ������","�̵�: ������","����: �����","����: �ҳ�","����: ��¥��"};
		
		System.out.print("��� �� - ");
		for(int i = 0; i<lolC.length; i++ ) {
			System.out.print(lolC[i]+" ");
		
		}
		System.out.println();
		System.out.print("���� �� - ");
		for(int i = 0; i<lolC.length; i++ ) {
		
			System.out.print(lolC2[i]+" ");
		}
	}
}
