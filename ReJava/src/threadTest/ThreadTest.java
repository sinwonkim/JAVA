package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
	//�����带 ����  1~100������ �հ踦 ���ϰ� ���� ��Ų��.
	 Thread t = new MyThread();
	 t.start();
	 // main�����忡����  1~10���� ���ؼ� ����� ����ϰ� �Ѵ�.
	 long multiplay = 1;
	 for(long i = 1; i<=10; i++) {
		 multiplay *= i;
		 System.out.println(i +"���ϱ� ���" + multiplay);
	 }
	 
	 System.out.println("------------------------------------");
	 System.out.println("1~10 ���ϱ�"+multiplay);
	}
}
