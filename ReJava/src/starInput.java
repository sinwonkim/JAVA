import java.util.Scanner;

public class starInput {
	static int sum;
	public static void main(String[] args) {
		
		
		/*java.util.Scanner Ŭ���� 

		Scanner�� �ܶ� ������ ������ ����� �Է��� ��ū�� ���� 
		�����ϸ� ����Ʈ�� ���Ǵ� �ܶ� ���ڴ� ���� �����̴�.
		�ۼ��� ��ū��, �پ��� next �޼��带 �����, �ٸ� ������
		������ ��ȯ�� �� �ִ�.
		*/	
		
	
		
		
		/*��ǥ�� �Է¹޾� ---  java.util.Scanner Ŭ���� Ȱ��
		 *���� �Է��Ҷ��� ���� ���ڷ� �Է��ϰ��� �׷��� �װ� ���ؼ� �ݺ��� ���� ���� ������ �Ѵ�.   
		 *��(������)�� �����.
		 *
		 */
		
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("���𰡸� �Է��ϼ���");
		int number  = scanner.nextInt();
		
		for(int i = 0; i <= number; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}*/
		
		/*for(int i = 0 ; i<5; i++ ) {
			for(int j = 0; j<i; j++) {
				System.out.println("i�� ���� :"+i+ " j�� ���� :"+j+" �Դϴ�.");
			}
			
		}
		
		System.out.println("����");*/
		
		/*
		 * for(�ʱ�ȭ; ���ǽ� ; ������) {
		 * "���ǽ��� true�� �� ����� ���๮"
		 * }
		 */
		 Scanner scan =  new Scanner(System.in);
		 System.out.println("���ڸ� �Է��ϼ���");
		 int x = scan.nextInt();
		
		 for(int i = 0; i<x; i++) {	 
			 for(int e = 0; e<(x*2)-i; e++) {
				 System.out.print(" ");
			 }
			for(int j = 0; j<i*2+1; j++) {
				 System.out.print("*");
			}		 
			System.out.println();
		 }
		 //���� �ﰢ�� ����� �� 
		 
		 
		 
		 for(int s=0 ; s<x; s++) {
			 for(int el=0; el<s; el++) {
				 System.out.print(" ");
			 } 
			 for(int tl=0; tl<x*2-s; tl++) {
				 System.out.print("*");
			 } 
			 for(int tr=0; tr<(x*2)-s; tr++) {
				 System.out.print("*");
			 }
			 
			 if(s<x) {
				 System.out.println();
			 }
		
		 }	

		// �߰� ����
		 
		 for(int b=0; b<x; b++) {
			 for(int el=0; el<x-b; el++) {
				 System.out.print(" ");
			 }
			 for(int bl=0; bl<(x+1)-b; bl++) {
				 System.out.print("*");
			 }
			 
			 for(int er=0; er<(b*4); er++) {
				 System.out.print(" ");
			 }
			 for(int br=0; br<(x+1)-b; br++) {
				 System.out.print("*");
			 }		
			 System.out.println(); 
		 }
		 	
		}
}
